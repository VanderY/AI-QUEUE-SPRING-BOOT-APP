package com.ai.queue.aiQueue.POJO;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "lesson")
    private String lesson;

    @Column(name = "week_day")
    private int weekDay;

    @Column(name = "week_number")
    private int weekNumber;

    @Column(name = "current_group")
    private String currentGroup;

    @Column(name = "lesson_type")
    private String lessonType;

    @Column(name = "subgroup")
    private int subgroup;


}
