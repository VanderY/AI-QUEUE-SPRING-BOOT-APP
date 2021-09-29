package com.ai.queue.aiQueue.entity;

public class StudentEntity {

    private String name;
    private String telegramId;
    private String subgroup;
    private String group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(String telegramId) {
        this.telegramId = telegramId;
    }

    public String getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(String subgroup) {
        this.subgroup = subgroup;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public StudentEntity(String name, String telegramId, String subgroup, String group) {
        this.name = name;
        this.telegramId = telegramId;
        this.subgroup = subgroup;
        this.group = group;
    }
}
