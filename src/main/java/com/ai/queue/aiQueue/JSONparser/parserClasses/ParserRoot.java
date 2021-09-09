package com.ai.queue.aiQueue.JSONparser.parserClasses;

import java.util.List;

public class ParserRoot {
    private Object employee;
    private ParserStudentGroup parserStudentGroup;
    private List<ParserSchedules> schedules;
    private List<Object> examSchedules;
    private String todayDate;
    private List<ParserTodaySchedule> parserTodaySchedules;
    private String tomorrowDate;
    private List<ParserTomorrowSchedule> parserTomorrowSchedules;
    private int currentWeekNumber;
    private String dateStart;
    private String dateEnd;
    private Object sessionStart;
    private Object sessionEnd;

    public ParserRoot() {
    }

    public ParserRoot(Object employee, ParserStudentGroup parserStudentGroup, List<ParserSchedules> schedules, List<Object> examSchedules, String todayDate, List<ParserTodaySchedule> parserTodaySchedules, String tomorrowDate, List<ParserTomorrowSchedule> parserTomorrowSchedules, int currentWeekNumber, String dateStart, String dateEnd, Object sessionStart, Object sessionEnd) {
        this.employee = employee;
        this.parserStudentGroup = parserStudentGroup;
        this.schedules = schedules;
        this.examSchedules = examSchedules;
        this.todayDate = todayDate;
        this.parserTodaySchedules = parserTodaySchedules;
        this.tomorrowDate = tomorrowDate;
        this.parserTomorrowSchedules = parserTomorrowSchedules;
        this.currentWeekNumber = currentWeekNumber;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.sessionStart = sessionStart;
        this.sessionEnd = sessionEnd;
    }

    public Object getEmployee() {
        return employee;
    }

    public void setEmployee(Object employee) {
        this.employee = employee;
    }

    public ParserStudentGroup getStudentGroup() {
        return parserStudentGroup;
    }

    public void setStudentGroup(ParserStudentGroup parserStudentGroup) {
        this.parserStudentGroup = parserStudentGroup;
    }

    public List<ParserSchedules> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<ParserSchedules> schedules) {
        this.schedules = schedules;
    }

    public List<Object> getExamSchedules() {
        return examSchedules;
    }

    public void setExamSchedules(List<Object> examSchedules) {
        this.examSchedules = examSchedules;
    }

    public String getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(String todayDate) {
        this.todayDate = todayDate;
    }

    public List<ParserTodaySchedule> getTodaySchedules() {
        return parserTodaySchedules;
    }

    public void setTodaySchedules(List<ParserTodaySchedule> parserTodaySchedules) {
        this.parserTodaySchedules = parserTodaySchedules;
    }

    public String getTomorrowDate() {
        return tomorrowDate;
    }

    public void setTomorrowDate(String tomorrowDate) {
        this.tomorrowDate = tomorrowDate;
    }

    public List<ParserTomorrowSchedule> getTomorrowSchedules() {
        return parserTomorrowSchedules;
    }

    public void setTomorrowSchedules(List<ParserTomorrowSchedule> parserTomorrowSchedules) {
        this.parserTomorrowSchedules = parserTomorrowSchedules;
    }

    public int getCurrentWeekNumber() {
        return currentWeekNumber;
    }

    public void setCurrentWeekNumber(int currentWeekNumber) {
        this.currentWeekNumber = currentWeekNumber;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Object getSessionStart() {
        return sessionStart;
    }

    public void setSessionStart(Object sessionStart) {
        this.sessionStart = sessionStart;
    }

    public Object getSessionEnd() {
        return sessionEnd;
    }

    public void setSessionEnd(Object sessionEnd) {
        this.sessionEnd = sessionEnd;
    }
}