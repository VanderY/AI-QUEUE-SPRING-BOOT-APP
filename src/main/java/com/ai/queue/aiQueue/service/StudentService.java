package com.ai.queue.aiQueue.service;

import com.ai.queue.aiQueue.POJO.Schedule;
import com.ai.queue.aiQueue.POJO.Student;
import com.ai.queue.aiQueue.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    Student getStudentByTelegramId(String uid);
    void SaveStudentEntity(StudentEntity studentEntity);
    boolean isRegisteredByEntity(StudentEntity studentEntity);
    List<Schedule> getStudentQueues(StudentEntity studentEntity);
    public boolean isRegisteredByUID(String uid);
}
