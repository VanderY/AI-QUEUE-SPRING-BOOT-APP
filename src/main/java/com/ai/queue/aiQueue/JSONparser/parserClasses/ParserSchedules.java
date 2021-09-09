package com.ai.queue.aiQueue.JSONparser.parserClasses;

import java.util.List;

public class ParserSchedules {
    private String weekDay;
    private List<ParserSchedule> schedule;

    public ParserSchedules() {
    }

    public ParserSchedules(String weekDay, List<ParserSchedule> schedule) {
        this.weekDay = weekDay;
        this.schedule = schedule;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public List<ParserSchedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ParserSchedule> schedule) {
        this.schedule = schedule;
    }
}