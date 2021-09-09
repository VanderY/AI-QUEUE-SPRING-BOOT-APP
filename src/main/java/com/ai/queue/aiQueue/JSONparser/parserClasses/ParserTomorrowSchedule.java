package com.ai.queue.aiQueue.JSONparser.parserClasses;

import java.util.List;

public class ParserTomorrowSchedule {
    private List<Integer> weekNumber;
    private List<String> studentGroup;
    private List<String> studentGroupInformation;
    private int numSubgroup;
    private List<String> auditory;
    private String lessonTime;
    private String startLessonTime;
    private String endLessonTime;
    private Object gradebookLesson;
    private String subject;
    private Object note;
    private String lessonType;
    private List<ParserEmployee> parserEmployee;
    private Object studentGroupModelList;
    private boolean zaoch;
    private Object gradebookLessonlist;


    public ParserTomorrowSchedule() {
    }

    public ParserTomorrowSchedule(List<Integer> weekNumber, List<String> studentGroup, List<String> studentGroupInformation, int numSubgroup, List<String> auditory, String lessonTime, String startLessonTime, String endLessonTime, Object gradebookLesson, String subject, Object note, String lessonType, List<ParserEmployee> parserEmployee, Object studentGroupModelList, boolean zaoch, Object gradebookLessonlist) {
        this.weekNumber = weekNumber;
        this.studentGroup = studentGroup;
        this.studentGroupInformation = studentGroupInformation;
        this.numSubgroup = numSubgroup;
        this.auditory = auditory;
        this.lessonTime = lessonTime;
        this.startLessonTime = startLessonTime;
        this.endLessonTime = endLessonTime;
        this.gradebookLesson = gradebookLesson;
        this.subject = subject;
        this.note = note;
        this.lessonType = lessonType;
        this.parserEmployee = parserEmployee;
        this.studentGroupModelList = studentGroupModelList;
        this.zaoch = zaoch;
        this.gradebookLessonlist = gradebookLessonlist;
    }

    public List<Integer> getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(List<Integer> weekNumber) {
        this.weekNumber = weekNumber;
    }

    public List<String> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<String> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<String> getStudentGroupInformation() {
        return studentGroupInformation;
    }

    public void setStudentGroupInformation(List<String> studentGroupInformation) {
        this.studentGroupInformation = studentGroupInformation;
    }

    public int getNumSubgroup() {
        return numSubgroup;
    }

    public void setNumSubgroup(int numSubgroup) {
        this.numSubgroup = numSubgroup;
    }

    public List<String> getAuditory() {
        return auditory;
    }

    public void setAuditory(List<String> auditory) {
        this.auditory = auditory;
    }

    public String getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(String lessonTime) {
        this.lessonTime = lessonTime;
    }

    public String getStartLessonTime() {
        return startLessonTime;
    }

    public void setStartLessonTime(String startLessonTime) {
        this.startLessonTime = startLessonTime;
    }

    public String getEndLessonTime() {
        return endLessonTime;
    }

    public void setEndLessonTime(String endLessonTime) {
        this.endLessonTime = endLessonTime;
    }

    public Object getGradebookLesson() {
        return gradebookLesson;
    }

    public void setGradebookLesson(Object gradebookLesson) {
        this.gradebookLesson = gradebookLesson;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Object getNote() {
        return note;
    }

    public void setNote(Object note) {
        this.note = note;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public List<ParserEmployee> getEmployee() {
        return parserEmployee;
    }

    public void setEmployee(List<ParserEmployee> parserEmployee) {
        this.parserEmployee = parserEmployee;
    }

    public Object getStudentGroupModelList() {
        return studentGroupModelList;
    }

    public void setStudentGroupModelList(Object studentGroupModelList) {
        this.studentGroupModelList = studentGroupModelList;
    }

    public boolean isZaoch() {
        return zaoch;
    }

    public void setZaoch(boolean zaoch) {
        this.zaoch = zaoch;
    }

    public Object getGradebookLessonlist() {
        return gradebookLessonlist;
    }

    public void setGradebookLessonlist(Object gradebookLessonlist) {
        this.gradebookLessonlist = gradebookLessonlist;
    }
}