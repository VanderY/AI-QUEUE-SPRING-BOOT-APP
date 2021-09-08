package JSONparser.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentGroup{
    private String name;
    private int facultyId;
    private Object facultyName;
    private int specialityDepartmentEducationFormId;
    private Object specialityName;
    private int course;
    private int id;
    private String calendarId;
}