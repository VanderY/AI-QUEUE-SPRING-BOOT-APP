package com.ai.queue.aiQueue.DAO;

import com.ai.queue.aiQueue.POJO.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student, Long> {
    boolean existsByTelegramId(String telegramId);
    Student getStudentByTelegramId(String telegramId);
}
