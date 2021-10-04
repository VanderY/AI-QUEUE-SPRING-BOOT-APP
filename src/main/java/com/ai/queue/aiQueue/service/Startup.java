package com.ai.queue.aiQueue.service;

import com.ai.queue.aiQueue.JSONparser.ParserScheduleAPI;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Startup {
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

    @PostConstruct
    private void postConstruct(){
 /*       scheduleServiceImpl.clearData();
        scheduleServiceImpl.saveAll(parserScheduleAPI.getParsedScheduleList());*/
    }

}
