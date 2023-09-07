import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Task {
    private int id;
    private String description;
    private boolean completed;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        String status = completed ? "[X]" : "[ ]";
        return "[" + id + "] " + status + " " + description;
    }
}

class ToDoList {
    private ArrayList<Task> tasks;
    private int nextTaskId;

    public ToDoList() {
        tasks = new ArrayList<>();
        nextTaskId = 1;
    }

    public void addTask(String description) {
        Task task = new Task(nextTaskId, description);
        tasks.add(task);
        nextTaskId++;
        System.out.println("Task added: " + task);
    }

    public void markTaskAsCompleted(int taskId) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.markAsCompleted();
                System.out.println("Task marked as completed: " + task);
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void listTasks() {
        System.out.println("Tasks:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void removeCompletedTasks() {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.isCompleted()) {
                iterator.remove();
            }
        }
        System.out.println("Completed tasks removed.");
    }
}

public class ToDoListApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        System.out.println("Welcome to the To-Do List Application!");

        while (true) {
            System.out.println("\n1. Add Task\n2. Mark Task as Completed\n3. List Tasks\n4. Remove Completed Tasks\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;

                case 2:
                    System.out.print("Enter task ID to mark as completed: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    toDoList.markTaskAsCompleted(taskId);
                    break;

                case 3:
                    toDoList.listTasks();
                    break;

                case 4:
                    toDoList.removeCompletedTasks();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
