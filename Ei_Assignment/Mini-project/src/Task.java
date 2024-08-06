import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;
    private String priority;

    public Task(String description, LocalTime startTime, LocalTime endTime, String priority) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return startTime + " - " + endTime + ": " + description + " [" + priority + "]";
    }

    public String toFileString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return description + "," + startTime.format(formatter) + "," + endTime.format(formatter) + "," + priority;
    }

    public static Task fromFileString(String fileString) {
        String[] parts = fileString.split(",");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String description = parts[0];
        LocalTime startTime = LocalTime.parse(parts[1], formatter);
        LocalTime endTime = LocalTime.parse(parts[2], formatter);
        String priority = parts[3];
        return new Task(description, startTime, endTime, priority);
    }
}
