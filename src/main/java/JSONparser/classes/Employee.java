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
public class Employee{
    private String firstName;
    private String lastName;
    private String middleName;
    private String degree;
    private String rank;
    private String photoLink;
    private String calendarId;
    private List<String> academicDepartment;
    private int id;
    private String urlId;
    private String fio;
}