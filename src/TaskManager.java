import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int userChoice = 0;

        boolean running = true;

        while(running){
            System.out.println("====== TASK MANAGER ======");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.println();

            System.out.println("Enter Your Choice: ");
            userChoice = Integer.parseInt(scanner.nextLine());

            if(userChoice == 1){
                System.out.println("What would you like to add?");
                String task = scanner.nextLine();
                tasks.add(task);

            }
            if(userChoice == 2){
                System.out.println("Here are your current Tasks: ");
                System.out.println(tasks);
            }
        }
    }
}
