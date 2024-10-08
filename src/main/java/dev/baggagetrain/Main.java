package dev.baggagetrain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Baggage-Train D&D Management System!");

        Scanner scanner = new Scanner(System.in);
        boolean isAskingAgain = true;

        while (isAskingAgain) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Create Character");
            System.out.println("2. View Character");
            System.out.println("3. Edit Character");
            System.out.println("4. Delete Character");
            System.out.println("5. Manage Inventory");
            System.out.println("6. Manage Spells");
            System.out.println("7. Exit");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Creating a character...");
                        break;
                    case 2:
                        System.out.println("Viewing character...");
                        break;
                    case 3:
                        System.out.println("Editing character...");
                        break;
                    case 4:
                        System.out.println("Deleting character...");
                        break;
                    case 5:
                        System.out.println("Managing inventory...");
                        break;
                    case 6:
                        System.out.println("Managing spells...");
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        isAskingAgain = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }

        scanner.close();
        System.out.println("Thank you for using the D&D Management System!");
    }
}
