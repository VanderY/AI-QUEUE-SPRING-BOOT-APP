package com.ai.queue.aiQueue.DAO;

import com.ai.queue.aiQueue.POJO.Schedule;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ScheduleDAO extends JpaRepository<Schedule, Integer> {
    List<Schedule> getScheduleByCurrentGroup(String group);
}
