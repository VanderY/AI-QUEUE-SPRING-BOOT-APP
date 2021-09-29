package com.ai.queue.aiQueue.entity;

public class StudentQEntity {

    private String telegramId;
    private String subject;
    private String date;
    private String qPlace;

    public StudentQEntity(String telegramId, String subject, String date, String qPlace) {
        this.telegramId = telegramId;
        this.subject = subject;
        this.date = date;
        this.qPlace = qPlace;
    }

    public String getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(String telegramId) {
        this.telegramId = telegramId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQPlace() {
        return qPlace;
    }

    public void setQPlace(String qPlace) {
        this.qPlace = qPlace;
    }
}
