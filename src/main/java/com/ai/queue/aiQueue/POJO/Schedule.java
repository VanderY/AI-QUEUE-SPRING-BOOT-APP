package com.ai.queue.aiQueue.POJO;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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
