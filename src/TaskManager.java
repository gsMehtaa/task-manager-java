
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int userChoice = 0;
        int subchoice = 0;

        boolean running = true;

        while (running) { // MAIN MENU
            try {
                System.out.println("====== TASK MANAGER ======");
                System.out.println("1. Add Task");
                System.out.println("2. View Task");
                System.out.println("3. Remove Task");
                System.out.println("4. Exit");
                System.out.println();

                System.out.println("Enter Your Choice:");
                userChoice = Integer.parseInt(scanner.nextLine());

                if (userChoice == 1) { // CHOICE 1 - ADD TASK

                    addTask(tasks, scanner);

                } else if (userChoice == 2) { // CHOICE 2 - VIEW TASKS

                    viewTask(tasks);

                    if (!tasks.isEmpty()) {

                        System.out.println("Would you like to add or remove anything?");
                        System.out.println("1. Add");
                        System.out.println("2. Remove");
                        System.out.println("3. Main Menu");

                        subchoice = Integer.parseInt(scanner.nextLine());

                        if (subchoice == 1) {

                            addTask(tasks, scanner);

                        } else if (subchoice == 2) {

                            System.out.println("ENTER A NUMBER TO REMOVE:");
                            int userTask = Integer.parseInt(scanner.nextLine());
                            int index = userTask - 1;

                            if (index >= 0 && index < tasks.size()) {
                                String removed = tasks.remove(index);
                                System.out.println(removed + " was Removed!");
                            } else {
                                System.out.println("INVALID TASK NUMBER!");
                            }

                        } else if (subchoice == 3) {
                            continue;

                        } else {
                            System.out.println("INVALID SUBMENU CHOICE!");
                        }
                    }

                } else if (userChoice == 3) { // CHOICE 3 - REMOVE TASK

                    if (tasks.isEmpty()) {
                        System.out.println("NO TASKS TO REMOVE!");
                    } else {

                        viewTask(tasks);

                        System.out.println("ENTER A NUMBER TO REMOVE:");
                        int userTask = Integer.parseInt(scanner.nextLine());
                        int index = userTask - 1;

                        if (index >= 0 && index < tasks.size()) {
                            String removed = tasks.remove(index);
                            System.out.println(removed + " was Removed!");
                        } else {
                            System.out.println("INVALID TASK NUMBER!");
                        }
                    }

                } else if (userChoice == 4) { // CHOICE 4 - EXIT

                    System.out.println("EXITING PROGRAM");
                    running = false;

                } else {
                    System.out.println("CHOOSE OPTIONS 1-4:");
                }

            } catch (NumberFormatException e) {
                System.out.println("INVALID INPUT! ENTER A NUMBER.");
            }
        }

        scanner.close();
    }

    // METHOD 1 - ADD TASK
    public static void addTask(ArrayList<String> tasks, Scanner scanner) {
        System.out.println("What task would you like to add?");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added Successfully!");
    }

    // METHOD 2 - VIEW TASKS
    public static void viewTask(ArrayList<String> tasks) {

        if (tasks.isEmpty()) {
            System.out.println("NO CURRENT TASKS");
        } else {
            System.out.println("Current Tasks:");

            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}
