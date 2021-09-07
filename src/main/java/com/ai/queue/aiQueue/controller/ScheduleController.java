package com.ai.queue.aiQueue.controller;

import com.ai.queue.aiQueue.POJO.Schedule;
import com.ai.queue.aiQueue.repos.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {

    @PostMapping
    public String schedule(@ModelAttribute("group") String group, @ModelAttribute("text") String text,@Autowired ScheduleRepository scheduleRepository){
        System.out.println(group);
        scheduleRepository.findAll();
        return "schedule/scheduleMain";
    }



}
