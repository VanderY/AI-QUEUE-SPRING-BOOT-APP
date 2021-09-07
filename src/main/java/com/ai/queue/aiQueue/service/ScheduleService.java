package com.ai.queue.aiQueue.service;

import com.ai.queue.aiQueue.POJO.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getSchedule(String group);
}
