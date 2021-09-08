package JSONparser.classes;

import JSONparser.classes.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Schedules{
    private List<Integer> weekNumber;
    private List<String> studentGroup;
    private List<String> studentGroupInformation;
    private int numSubgroup;
    private List<String> auditory;
    private String lessonTime;
    private String startLessonTime;
    private String endLessonTime;
    private Object gradebookLesson;
    private String subject;
    private Object note;
    private String lessonType;
    private List<Employee> employee;
    private Object studentGroupModelList;
    private boolean zaoch;
    private Object gradebookLessonlist;
}