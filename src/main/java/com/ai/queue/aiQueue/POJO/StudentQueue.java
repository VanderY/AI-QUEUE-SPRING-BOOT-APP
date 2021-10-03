package com.ai.queue.aiQueue.POJO;

import javax.persistence.*;
import java.rmi.StubNotFoundException;
import java.time.LocalDate;

@Entity
@Table(name = "student_queue")
public class StudentQueue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "owner")
    private Student studentID;

    @Column(name = "lesson_name")
    private String lesson;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "place_number")
    private int placeNum = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudentID() {
        return studentID;
    }

    public void setStudentID(Student studentID) {
        this.studentID = studentID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPlaceNum() {
        return placeNum;
    }

    public void setPlaceNum(int placeNum) {
        this.placeNum = placeNum;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
