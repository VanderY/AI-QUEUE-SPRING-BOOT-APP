package com.ai.queue.aiQueue.DAO;

import com.ai.queue.aiQueue.POJO.Student;
import com.ai.queue.aiQueue.POJO.StudentQueue;
import com.ai.queue.aiQueue.entity.StudentQEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentQueueDAO extends JpaRepository<StudentQueue, Long> {
    List<Student> getAllByStudentID_TelegramId(String telegramId);
}
