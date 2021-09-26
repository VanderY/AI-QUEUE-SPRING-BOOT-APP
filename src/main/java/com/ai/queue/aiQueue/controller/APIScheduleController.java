package com.ai.queue.aiQueue.controller;

import com.ai.queue.aiQueue.POJO.Schedule;
import com.ai.queue.aiQueue.service.ScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class APIScheduleController {
    private ScheduleServiceImpl scheduleServiceImpl;

    @Autowired
    @Qualifier("scheduleServiceImpl")
    public void setScheduleServiceImpl(ScheduleServiceImpl scheduleServiceImpl) {
        this.scheduleServiceImpl = scheduleServiceImpl;
    }


    @GetMapping(value = {"/schedule/{group}","/schedule/{group}/{date}"})
    public List<Schedule> getSchedule(@PathVariable String group, @PathVariable(required = false) Date date){
        if(date != null) {
            return scheduleServiceImpl.getScheduleListByGroupAndDate(group, date);
            //return scheduleServiceImpl.getScheduleListByGroupAndDate("921703", Date.valueOf("2021-09-27"));
        }
        else{
            return  scheduleServiceImpl.getScheduleListByGroup(group);
        }
    }

}
