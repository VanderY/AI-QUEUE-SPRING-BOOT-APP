package com.ai.queue.aiQueue.controller;

import com.ai.queue.aiQueue.service.ScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/insert_entity")
public class BotAPIController {

    @Autowired
    private ScheduleServiceImpl scheduleServiceImpl;

    @PostMapping("/{token}/{name}/{lessonName}/{date}")
    public void setNewEntity(@PathVariable("token") String token,
                             @PathVariable("name") String name,
                             @PathVariable("lessonName") String lessonName,
                             @PathVariable("date") String weekDay){

    }
}
