package com.ai.queue.aiQueue.JSONparser.parserClasses;

import java.util.List;

public class ParserEmployee {
    private String firstName;
    private String lastName;
    private String middleName;
    private String degree;
    private String rank;
    private String photoLink;
    private String calendarId;
    private List<String> academicDepartment;
    private int id;
    private String urlId;
    private String fio;

    public ParserEmployee() {
    }

    public ParserEmployee(String firstName, String lastName, String middleName, String degree, String rank, String photoLink, String calendarId, List<String> academicDepartment, int id, String urlId, String fio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.degree = degree;
        this.rank = rank;
        this.photoLink = photoLink;
        this.calendarId = calendarId;
        this.academicDepartment = academicDepartment;
        this.id = id;
        this.urlId = urlId;
        this.fio = fio;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public List<String> getAcademicDepartment() {
        return academicDepartment;
    }

    public void setAcademicDepartment(List<String> academicDepartment) {
        this.academicDepartment = academicDepartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrlId() {
        return urlId;
    }

    public void setUrlId(String urlId) {
        this.urlId = urlId;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
}