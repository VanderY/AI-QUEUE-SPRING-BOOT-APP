package com.ai.queue.aiQueue.service;

import com.ai.queue.aiQueue.DAO.ScheduleDAO;
import com.ai.queue.aiQueue.POJO.Schedule;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@Service
@Qualifier("scheduleServiceImpl")
@EnableJpaRepositories
public class ScheduleServiceImpl implements ScheduleService {

    private ScheduleDAO scheduleDAO;

    @Autowired
    public void setScheduleDAO(ScheduleDAO scheduleDAO) {
        this.scheduleDAO = scheduleDAO;
    }

    @Override
    public List<Schedule> getScheduleListByGroup(String group) {
        return scheduleDAO.findAllByCurrentGroup(group);
    }

    @Override
    public List<Schedule> getScheduleListByGroupAndDate(String group, Date date) {
        DayOfWeek dayOfWeekClass = date.toLocalDate().getDayOfWeek();
        int dayOfWeek = dayOfWeekClass.getValue();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int weekNumber = calendar.get(Calendar.WEEK_OF_MONTH);
        if(weekNumber==5){
            weekNumber=1;
        }
        return scheduleDAO.findAllByCurrentGroupAndWeekNumberAndWeekDay(group, weekNumber, dayOfWeek);
    }

    @Override
    public void saveAll(List<Schedule> list) {
        for (Schedule schedule : list) {
            scheduleDAO.saveAndFlush(schedule);
        }

    }

    @Override
    public void save(Schedule schedule) {
        scheduleDAO.save(schedule);
        scheduleDAO.flush();
    }

    @Override
    public void clearData() {
        scheduleDAO.deleteAll();
    }

    @Override
    public Schedule getScheduleByNameAndDate(String name, String date) {

        int dayOfWeek = LocalDate.parse(date).getDayOfWeek().getValue();
        Calendar calendar = new GregorianCalendar();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate ld = LocalDate.parse(date);
        calendar.setTime(Date.valueOf(LocalDate.parse(date, formatter1)));
        int weekNumber = calendar.get(Calendar.WEEK_OF_MONTH);
        if(weekNumber==5){
            weekNumber=1;
        }
        return scheduleDAO.findByCurrentGroupAndAndLessonAndWeekDayAndWeekNumber("921703", name, dayOfWeek, weekNumber);
    }
}
