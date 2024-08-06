import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TaskFactory {
    public Task createTask(String description, String startTime, String endTime, String priority) throws IllegalArgumentException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime start = LocalTime.parse(startTime, formatter);
            LocalTime end = LocalTime.parse(endTime, formatter);

            if (start.isAfter(end)) {
                throw new IllegalArgumentException("Start time must be before end time.");
            }

            if (!priority.equalsIgnoreCase("High") && !priority.equalsIgnoreCase("Medium") && !priority.equalsIgnoreCase("Low")) {
                throw new IllegalArgumentException("Priority must be High, Medium, or Low.");
            }

            return new Task(description, start, end, priority);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid time format. Use HH:mm.");
        }
    }
}
