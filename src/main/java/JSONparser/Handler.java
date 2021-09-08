package JSONparser;

import com.ai.queue.aiQueue.POJO.Schedule;

import java.util.List;

public interface Handler {
    List<Schedule> handle(List<String> jsonList);
}
