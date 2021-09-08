package com.ai.queue.aiQueue.service;

import com.ai.queue.aiQueue.POJO.Schedule;

import java.sql.Timestamp;
import java.sql.Date;
import java.util.List;

public interface ScheduleService {
    List<Schedule> getSchedule(String group);
    List<Schedule> getScheduleByDate(Date date);
    List<Schedule> getScheduleByPeriod(Date first, Date second);
    List<Schedule> getScheduleByGroupAndTime(String group, Date time);
}
