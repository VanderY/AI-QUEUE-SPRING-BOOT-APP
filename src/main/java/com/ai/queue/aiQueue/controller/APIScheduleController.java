package com.ai.queue.aiQueue.controller;

import com.ai.queue.aiQueue.POJO.Schedule;
import com.ai.queue.aiQueue.POJO.Student;
import com.ai.queue.aiQueue.POJO.StudentQueue;
import com.ai.queue.aiQueue.entity.StudentEntity;
import com.ai.queue.aiQueue.entity.StudentQEntity;
import com.ai.queue.aiQueue.service.ScheduleServiceImpl;
import com.ai.queue.aiQueue.service.StudentQueueServiceImpl;
import com.ai.queue.aiQueue.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class APIScheduleController {

    private ScheduleServiceImpl scheduleServiceImpl;

    @Autowired
    @Qualifier("scheduleServiceImpl")
    public void setScheduleServiceImpl(ScheduleServiceImpl scheduleServiceImpl) {
        this.scheduleServiceImpl = scheduleServiceImpl;
    }

    @GetMapping(value = {"/schedule/{group}","/schedule/{group}/{date}"})
    public List<Schedule> getSchedule(@PathVariable String group, @PathVariable(required = false) Date date){
        if(date != null) {
            return scheduleServiceImpl.getScheduleListByGroupAndDate(group, date);
            //return scheduleServiceImpl.getScheduleListByGroupAndDate("921703", Date.valueOf("2021-09-27"));
        }
        else{
            return  scheduleServiceImpl.getScheduleListByGroup(group);
        }
    }

    private StudentQueueServiceImpl studentQueueService;
    private StudentServiceImpl studentService;

    @Autowired
    public void setStudentQueueService(StudentQueueServiceImpl studentQueueService) {
        this.studentQueueService = studentQueueService;
    }

    @Autowired
    public void setStudentService(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @PostMapping(
            value = "/register", consumes = "application/json", produces = "application/json")
    public String register(@RequestBody StudentEntity studentEntity){
        System.out.println(studentEntity);
        if(studentService.isRegisteredByEntity(studentEntity)) return "Student Already Registered";
        else{
            studentService.SaveStudentEntity(studentEntity);
            return new String(studentEntity.getTelegramId() + " has been registered");
        }
    }
    @GetMapping("/isRegistered/{uid}")
    public String isRegistered(@PathVariable String uid){
        return String.valueOf(studentService.isRegisteredByUID(uid));
    }



    @GetMapping(value = "/test", produces = "application/json")
    public Student test(){
        Student student = new Student();
        student.setTelegramId("1");
        student.setSubgroup(1);
        student.setName("test");
        student.setGroup("1488");
        return student;
    }

    @PostMapping(value = "putIntoTheQueue", consumes = "application/json")
    public String putIntoTheQ(StudentQEntity qEntity){
        System.out.println(qEntity);
       /* StudentQueue studentQueue = new StudentQueue();
        studentQueue.setDate(LocalDate.parse(qEntity.getDate()));
        studentQueue.setStudentID(studentService.getStudentByTelegramId(qEntity.getTelegramId()));
        studentQueueService.save(studentQueue);*/
        return "done done done ";
    }
}
