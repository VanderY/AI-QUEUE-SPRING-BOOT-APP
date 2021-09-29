package com.ai.queue.aiQueue.POJO;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="telegram_id")
    private String telegramId;

    @Column(name = "student_name")
    private String name;

    @Column(name = "subgroup")
    private int subgroup;

    @Column(name = "group_number")
    private String group;

    @OneToMany(mappedBy = "studentID")
    private List<StudentQueue> studentQueueList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelegramId() {
        return telegramId;
    }

    public void setTelegramId(String telegramId) {
        this.telegramId = telegramId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubgroup() {
        return subgroup;
    }

    public void setSubgroup(int subgroup) {
        this.subgroup = subgroup;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
