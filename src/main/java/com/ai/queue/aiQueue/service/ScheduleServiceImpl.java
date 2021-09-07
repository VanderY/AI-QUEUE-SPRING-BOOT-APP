package com.ai.queue.aiQueue.service;

import com.ai.queue.aiQueue.DAO.ScheduleDAO;
import com.ai.queue.aiQueue.POJO.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
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
}
