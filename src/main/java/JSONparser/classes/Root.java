package JSONparser.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Root{
    private Object employee;
    private StudentGroup studentGroup;
    private List<Schedule> schedules;
    private List<Object> examSchedules;
    private String todayDate;
    private List<TodaySchedule> todaySchedules;
    private String tomorrowDate;
    private List<TomorrowSchedule> tomorrowSchedules;
    private int currentWeekNumber;
    private String dateStart;
    private String dateEnd;
    private Object sessionStart;
    private Object sessionEnd;
}