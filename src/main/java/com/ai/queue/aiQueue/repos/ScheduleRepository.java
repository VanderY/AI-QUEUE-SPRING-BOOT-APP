package com.ai.queue.aiQueue.repos;

import com.ai.queue.aiQueue.POJO.Schedule;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
    List<Schedule> findByCurrentGroup(String currentGroup);
}
