package com.ai.queue.aiQueue.JSONparser.parserClasses;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */

public class ParserStudentGroup {
    private String name;
    private int facultyId;
    private Object facultyName;
    private int specialityDepartmentEducationFormId;
    private Object specialityName;
    private int course;
    private int id;
    private String calendarId;

    public ParserStudentGroup() {
    }

    public ParserStudentGroup(String name, int facultyId, Object facultyName, int specialityDepartmentEducationFormId, Object specialityName, int course, int id, String calendarId) {
        this.name = name;
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.specialityDepartmentEducationFormId = specialityDepartmentEducationFormId;
        this.specialityName = specialityName;
        this.course = course;
        this.id = id;
        this.calendarId = calendarId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public Object getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(Object facultyName) {
        this.facultyName = facultyName;
    }

    public int getSpecialityDepartmentEducationFormId() {
        return specialityDepartmentEducationFormId;
    }

    public void setSpecialityDepartmentEducationFormId(int specialityDepartmentEducationFormId) {
        this.specialityDepartmentEducationFormId = specialityDepartmentEducationFormId;
    }

    public Object getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(Object specialityName) {
        this.specialityName = specialityName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }
}