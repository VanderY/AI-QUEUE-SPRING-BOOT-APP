package com.ai.queue.aiQueue.service;

import com.ai.queue.aiQueue.DAO.StudentDAO;
import com.ai.queue.aiQueue.POJO.Schedule;
import com.ai.queue.aiQueue.POJO.Student;
import com.ai.queue.aiQueue.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;


    @Override
    public Student getStudentByTelegramId(String uid) {
        return studentDAO.getStudentByTelegramId(uid);
    }

    @Override
    public void SaveStudentEntity(StudentEntity studentEntity) {
        Student student = new Student();
        student.setGroup(studentEntity.getGroup());
        student.setName(studentEntity.getName());
        student.setSubgroup(Integer.parseInt(studentEntity.getSubgroup()));
        student.setTelegramId(studentEntity.getTelegramId());
        studentDAO.saveAndFlush(student);
    }

    @Override
    public boolean isRegisteredByEntity(StudentEntity studentEntity) {
        return studentDAO.existsByTelegramId(studentEntity.getTelegramId());
    }

    @Override
    public boolean isRegisteredByUID(String uid) {
        return studentDAO.existsByTelegramId(uid);
    }

    @Override
    public List<Schedule> getStudentQueues(StudentEntity studentEntity) {
        return null;
    }


}
