package com.ai.queue.aiQueue.service;

import com.ai.queue.aiQueue.DAO.ScheduleDAO;
import com.ai.queue.aiQueue.POJO.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService{

    private ScheduleDAO scheduleDAO;



    @Autowired
    public void setScheduleDAO(ScheduleDAO scheduleDAO) {
        this.scheduleDAO = scheduleDAO;
    }

    @Override
    public List<Schedule> getSchedule(String group) {
        return scheduleDAO.getScheduleByCurrentGroup(group);
    }

    @Override
    public List<Schedule> getScheduleByDate(Date date) {
        return scheduleDAO.getScheduleByLessonTime(date);
    }

    @Override
    public List<Schedule> getScheduleByPeriod(Date first, Date second) {
        return scheduleDAO.getScheduleByLessonBetween(first, second);
    }

    @Override
    public List<Schedule> getScheduleByGroupAndTime(String group, Date date){
        return scheduleDAO.getScheduleByCurrentGroupAndLessonTime(group, date);
    }
}
