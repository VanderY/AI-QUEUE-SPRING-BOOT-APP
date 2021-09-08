package com.ai.queue.aiQueue.controller;

import com.ai.queue.aiQueue.service.ScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
    private ScheduleServiceImpl scheduleServiceImpl;

    @Autowired
    public void setScheduleServiceImpl(ScheduleServiceImpl scheduleServiceImpl) {
        this.scheduleServiceImpl = scheduleServiceImpl;
    }

    @ModelAttribute("localDate")
    public String localDate(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return LocalDate.now().format(format);
    }


    @PostMapping
    public String schedule(@ModelAttribute("group") String group, Model model){
        model.addAttribute("scheduleList", scheduleServiceImpl.getScheduleByGroupAndTime(group, Date.valueOf(LocalDate.now())));
        return "schedule/scheduleMain";
    }

    @PostMapping("/date")
    public String getScheduleByDate(@ModelAttribute("group") String group, @ModelAttribute("date") String date, Model model){
        System.out.println(date);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd" );
        LocalDate ld = LocalDate.parse(date, dtf);
        Date parsed = Date.valueOf(ld);
        System.out.println(parsed);
        model.addAttribute("scheduleList", scheduleServiceImpl.getScheduleByDate(parsed));
        return "schedule/scheduleMain";
    }



}
