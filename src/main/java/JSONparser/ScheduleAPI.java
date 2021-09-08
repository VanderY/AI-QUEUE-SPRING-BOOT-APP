package JSONparser;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ScheduleAPI {
    private List<String> groupsJSON;

    public ScheduleAPI(){
        groupsJSON = new ArrayList<>();
        List<String> groupList = new ArrayList<>();
        {
            groupList.add("921701");
            groupList.add("921702");
            groupList.add("921703");
            groupList.add("921704");
        }
        try {

            for (String s : groupList) {
                URL schedule = new URL("https://journal.bsuir.by/api/v1/portal/schedule?studentGroup=" + s);
                HttpURLConnection connection = (HttpURLConnection) schedule.openConnection();
                connection.setRequestMethod("GET");

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                groupsJSON.add(response.toString());
                in.close();
                System.out.println(response);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getGroupsJSON() {
        return groupsJSON;
    }
}
