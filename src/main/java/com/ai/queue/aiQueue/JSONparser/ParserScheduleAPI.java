package com.ai.queue.aiQueue.JSONparser;

import com.ai.queue.aiQueue.JSONparser.parserClasses.ParserRoot;
import com.ai.queue.aiQueue.JSONparser.parserClasses.ParserSchedule;
import com.ai.queue.aiQueue.JSONparser.parserClasses.ParserSchedules;
import com.ai.queue.aiQueue.JSONparser.parserEnums.WeekDays;
import com.ai.queue.aiQueue.POJO.Schedule;
import com.ai.queue.aiQueue.service.ScheduleServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Component("parserScheduleAPI")
public class ParserScheduleAPI {
    private ScheduleServiceImpl scheduleServiceImpl;
    private List<String> groupsJSON;

    @Autowired
    @Qualifier("scheduleServiceImpl")
    public void setScheduleServiceImpl(ScheduleServiceImpl scheduleServiceImpl) {
        this.scheduleServiceImpl = scheduleServiceImpl;
    }

    public ParserScheduleAPI() {
        groupsJSON = new ArrayList<>();
        List<String> groupList = new ArrayList<>();
        {
            groupList.add("921701");
            groupList.add("921702");
            groupList.add("921703");
            groupList.add("921704");
        }
        try {

            for (String s : groupList) {
                URL schedule = new URL("https://journal.bsuir.by/api/v1/portal/schedule?studentGroup=" + s);
                HttpURLConnection connection = (HttpURLConnection) schedule.openConnection();
                connection.setRequestMethod("GET");

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                groupsJSON.add(response.toString());
                in.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getGroupsJSON() {
        return groupsJSON;
    }

    public List<Schedule> getParsedScheduleList() {
        List<Schedule> result = new ArrayList<>();
        int id = 1;
        ObjectMapper om = new ObjectMapper();
        for (String json : groupsJSON) {
            try {
                ParserRoot parserRoot = om.readValue(json, ParserRoot.class);
                for (ParserSchedules s : parserRoot.getSchedules()) {
                    String currentWeekDay = s.getWeekDay();
                    int currentWeekDayNumber = -1;
                    WeekDays[] weekDays = WeekDays.values();
                    for (WeekDays wd : weekDays) {
                        if (wd.name().equals(currentWeekDay))
                            currentWeekDayNumber = wd.ordinal();
                    }
                    for (ParserSchedule parserSchedule : s.getSchedule()) {
                        Schedule schedule = new Schedule();
                        schedule.setCurrentGroup(parserSchedule.getStudentGroup().toString().replace("[", "").replace("]", "").trim());
                        schedule.setSubgroup(parserSchedule.getNumSubgroup());
                        schedule.setLesson(parserSchedule.getSubject());
                        schedule.setLessonType(parserSchedule.getLessonType());
                        schedule.setId(id);

                        List<Integer> currentWeekNumber = parserSchedule.getWeekNumber();
                        for (Integer i : currentWeekNumber) {
                            if (i == 0) {
                                continue;
                            } else {
                                schedule.setWeekDay(currentWeekDayNumber);
                                schedule.setWeekNumber(i);
                                scheduleServiceImpl.save(schedule);
                                System.out.println(id);
                                id++;
                            }
                        }
                    }
                }
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

        }
        System.out.println(result.size());
        return result;
    }

}
