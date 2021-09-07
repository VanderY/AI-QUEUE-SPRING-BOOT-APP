package com.ai.queue.aiQueue.POJO;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "lesson")
    private String lesson;

    @Column(name = "lesson_time")
    private Timestamp lessonTime;

    @Column(name = "current_group")
    private String currentGroup;

    @Column(name = "lesson_type")
    private String lessonType;

    @Column(name = "subgroup")
    private int subgroup;


}
