package main.java;

import java.util.ArrayList;
import java.util.Scanner;

public class doMain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> listToDo = new ArrayList<String>();

    public static int menu(){
        System.out.println("--------------MENU--------------");
        System.out.println("1. Add more task.");
        System.out.println("2. List all tasks.");
        System.out.println("3. Delete task.");
        System.out.println("4. Exit.");
        System.out.print("You want: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        while (true) {
            int userChoice = menu();
            switch (userChoice) {
                case 1:
                    System.out.println("Adding task......\n");
                    System.out.print("Enter task to add: ");
                    sc.nextLine();
                    String task = sc.nextLine();
                    listToDo.add(task);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Listing all task......\n");
                    System.out.println(listToDo + "\n");
                    break;
                case 3:
                    System.out.println("Deleting task......\n");
                    System.out.println("Enter index task you want to delete: ");
                    int ind = sc.nextInt();
                    try {
                        listToDo.remove(ind);
                    } catch (Exception e) {
                        System.out.println("Invalid task!");
                    }
                    break;
                case 4:
                    System.out.println("Good bye! See you later.");
                    System.exit(0);
            }
        }
    }
}