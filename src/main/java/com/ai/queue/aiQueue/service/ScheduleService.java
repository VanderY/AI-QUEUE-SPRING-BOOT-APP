package com.ai.queue.aiQueue.service;


import com.ai.queue.aiQueue.POJO.Schedule;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface ScheduleService {
    List<Schedule> getScheduleListByGroup(String group);
    List<Schedule> getScheduleListByGroupAndDate(String group, Date date);
    void save(Schedule schedule);
    void saveAll(List<Schedule> list);
    void clearData();
    Schedule getScheduleByNameAndDate(String name, LocalDate date);
}
