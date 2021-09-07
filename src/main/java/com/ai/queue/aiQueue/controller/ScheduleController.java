package com.ai.queue.aiQueue.controller;

import com.ai.queue.aiQueue.service.ScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
    private ScheduleServiceImpl scheduleServiceImpl;

    @Autowired
    public void setScheduleServiceImpl(ScheduleServiceImpl scheduleServiceImpl) {
        this.scheduleServiceImpl = scheduleServiceImpl;
    }

    @PostMapping
    public String schedule(@ModelAttribute("group") String group, @ModelAttribute("text") String text, Model model){
        model.addAttribute("scheduleList", scheduleServiceImpl.getSchedule("921703"));
        return "schedule/scheduleMain";
    }



}
