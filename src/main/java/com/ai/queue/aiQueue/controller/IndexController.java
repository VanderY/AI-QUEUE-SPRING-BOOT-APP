package com.ai.queue.aiQueue.controller;

import com.ai.queue.aiQueue.AiQueueApplication;
import com.ai.queue.aiQueue.JSONparser.ParserScheduleAPI;
import com.ai.queue.aiQueue.service.ScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Date;

@Controller
@RequestMapping("/")
public class IndexController {

    private ParserScheduleAPI parserScheduleAPI;
    private ScheduleServiceImpl scheduleServiceImpl;

    @ModelAttribute("dateNow")
    public LocalDate dateNow(){
        return LocalDate.now();
    }


    @Autowired
    public void setScheduleServiceImpl(ScheduleServiceImpl scheduleServiceImpl) {
        this.scheduleServiceImpl = scheduleServiceImpl;
    }

    @Autowired
    public void setParserScheduleAPI(ParserScheduleAPI parserScheduleAPI) {
        this.parserScheduleAPI = parserScheduleAPI;
    }

    @GetMapping
    public String index(){
        return "index";
    }
}
