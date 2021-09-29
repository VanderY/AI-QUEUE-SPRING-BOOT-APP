package com.ai.queue.aiQueue.service;

import com.ai.queue.aiQueue.DAO.StudentQueueDAO;
import com.ai.queue.aiQueue.POJO.StudentQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentQueueServiceImpl implements StudentQueueService {
    @Autowired
    private StudentQueueDAO studentQueueDAO;

    @Override
    public void save(StudentQueue sq) {
        studentQueueDAO.save(sq);
    }
}
