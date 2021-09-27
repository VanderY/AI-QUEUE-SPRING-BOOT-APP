package com.ai.queue.aiQueue.controller;

import com.ai.queue.aiQueue.service.ScheduleServiceImpl;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
    @Qualifier("scheduleServiceImpl")
    public void setScheduleServiceImpl(ScheduleServiceImpl scheduleServiceImpl) {
        this.scheduleServiceImpl = scheduleServiceImpl;
    }


    @PostMapping
    public String schedule(@ModelAttribute("group") String group,
                           Model model,
                           HttpServletRequest request) {
        model.addAttribute("date", LocalDate.now().format(DateTimeFormatter.ofPattern("d MMMM yyyy")));
        request.getSession().setAttribute("group", group);
        model.addAttribute("scheduleList", scheduleServiceImpl.getScheduleListByGroupAndDate(group, Date.valueOf(LocalDate.now())));
        return "schedule/scheduleMain";
    }

    @PostMapping("/date")
    public String getScheduleByDate(@ModelAttribute("date") String date,
                                    @ModelAttribute("group") String group,
                                    Model model,
                                    HttpServletRequest request) {

        if (date.isEmpty()) {
            model.addAttribute("scheduleList", scheduleServiceImpl.getScheduleListByGroupAndDate(group, Date.valueOf(LocalDate.now())));
        } else {
            model.addAttribute("scheduleList", scheduleServiceImpl.getScheduleListByGroupAndDate(group, Date.valueOf(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")))));
        }
        model.addAttribute("date", new SimpleDateFormat("d MMMM yyyy").format(Date.valueOf(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")))).toString());


        return "schedule/scheduleMain";
    }


}
