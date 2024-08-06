import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        TaskFactory taskFactory = new TaskFactory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Export Tasks");
            System.out.println("5. Import Tasks from File");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = 0;
            
            // Input validation for choice
            try {
                choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter description: ");
                        String description = scanner.nextLine();
                        System.out.print("Enter start time (HH:mm): ");
                        String startTime = scanner.nextLine();
                        System.out.print("Enter end time (HH:mm): ");
                        String endTime = scanner.nextLine();
                        System.out.print("Enter priority (High/Medium/Low): ");
                        String priority = scanner.nextLine();
                        Task task = taskFactory.createTask(description, startTime, endTime, priority);
                        manager.addTask(task);
                        break;
                    case 2:
                        System.out.print("Enter task description to remove: ");
                        String descToRemove = scanner.nextLine();
                        manager.removeTask(descToRemove);
                        break;
                    case 3:
                        List<Task> tasks = manager.viewTasks();
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks scheduled for the day.");
                        } else {
                            tasks.forEach(System.out::println);
                        }
                        break;
                    case 4:
                        manager.exportTasks();
                        System.out.println("Tasks exported successfully.");
                        break;
                    case 5:
                        System.out.print("Enter import file path: ");
                        String importFilePath = scanner.nextLine();
                        manager.importTasksFromFile(importFilePath);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
