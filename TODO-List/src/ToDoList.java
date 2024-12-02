import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    private List<String> tasks;
    private Scanner scanner;

    public ToDoList() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("\n--------------TO DO LIST -------------");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. View All Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
        scanner.close();
    }

    // Méthode pour afficher toutes les tâches
    private void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Your Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Méthode pour ajouter une tâche
    private void addTask() {
        System.out.print("Enter Task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    // Méthode pour supprimer une tâche
    private void deleteTask() {
        displayTasks(); // Affiche la liste des tâches avant de demander à supprimer
        if (tasks.isEmpty()) return; // Si aucune tâche n'est présente, rien à supprimer

        System.out.print("Enter Task number to delete: ");
        int taskNumber = scanner.nextInt();
        scanner.nextLine(); // Consommer le retour à la ligne

        // Vérification de la validité de l'index
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1); // La liste commence à l'indice 0
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

}

