package com.ai.queue.aiQueue.DAO;

import com.ai.queue.aiQueue.POJO.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ScheduleDAO extends JpaRepository<Schedule, Integer> {
    List<Schedule> findAllByCurrentGroupAndWeekNumberAndWeekDay(String group, int weekNumber, int weekDay);
    List<Schedule> findAllByCurrentGroup(String group);
    List<Schedule> findAllByLesson(String lesson);
    Schedule findAllByCurrentGroupAndLessonAndWeekDayAndWeekNumber(String group, String name, int weekDay, int weekNumber);
    Schedule getScheduleByLessonAndWeekDayAndWeekNumber(String name, int weekDay, int weekNumber);
}