package JSONparser;

import JSONparser.classes.Root;
import com.ai.queue.aiQueue.POJO.Schedule;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JsonHandler implements Handler {
    @Override
    public List<Schedule> handle(List<String> jsonList) {
        ObjectMapper om = new ObjectMapper();
        try {
            Root root = om.readValue(jsonList.get(2), Root.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }
}
