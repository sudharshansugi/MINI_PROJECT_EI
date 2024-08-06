import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private static final String FILE_PATH = "tasks.txt";

    private ScheduleManager() {
        tasks = new ArrayList<>();
        loadTasksFromFile();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) throws IllegalArgumentException {
        for (Task t : tasks) {
            if (task.getStartTime().isBefore(t.getEndTime()) && task.getEndTime().isAfter(t.getStartTime())) {
                System.out.println("Error: Task conflicts with existing task: " + t.getDescription());
                return;
            }
        }
        tasks.add(task);
        tasks.sort(Comparator.comparing(Task::getStartTime)); // Sort tasks by start time
        System.out.println("Task added successfully. No conflicts.");
        appendTaskToFile(task);
    }

    public void removeTask(String description) throws IllegalArgumentException {
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getDescription().equalsIgnoreCase(description)) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task removed successfully.");
            saveTasksToFile();
        } else {
            throw new IllegalArgumentException("Task not found.");
        }
    }

    public List<Task> viewTasks() {
        return Collections.unmodifiableList(tasks); // Returns an unmodifiable view of the tasks list
    }
// addings

    private void appendTaskToFile(Task task) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(task.toFileString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void exportTasks() {
        saveTasksToFile();
    }

    private void loadTasksFromFile() {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
                return;
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Task task = Task.fromFileString(line);
                tasks.add(task);
            }
            tasks.sort(Comparator.comparing(Task::getStartTime)); // Sort tasks by start time
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    private void saveTasksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Task task : tasks) {
                writer.write(task.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void importTasksFromFile(String importFilePath) {
        File file = new File(importFilePath);
        if (!file.exists()) {
            System.out.println("Error: Import file not found.");
            return;
        }
    
        try (BufferedReader reader = new BufferedReader(new FileReader(importFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Task task = Task.fromFileString(line);
                tasks.add(task);
                appendTaskToFile(task);
            }
            tasks.sort(Comparator.comparing(Task::getStartTime)); // Sort tasks by start time
            System.out.println("Tasks imported successfully.");
        } catch (IOException e) {
            System.out.println("Error reading from import file: " + e.getMessage());
        }
    }
    
}
