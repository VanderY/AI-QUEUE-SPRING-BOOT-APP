package com.ai.queue.aiQueue.controller;

import com.ai.queue.aiQueue.JSONparser.ParserScheduleAPI;
import com.ai.queue.aiQueue.service.ScheduleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
    private ParserScheduleAPI parserScheduleAPI;
    private ScheduleServiceImpl scheduleServiceImpl;

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
        scheduleServiceImpl.clearData();
        scheduleServiceImpl.saveAll(parserScheduleAPI.getParsedScheduleList());
        return "index";
    }
}
