package org.example;

import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayDemo arrayDemo = new ArrayDemo();
        int choice = 0;
        do {
        System.out.println("1. Create an Array");
        System.out.println("2. Display an Array");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the length of the array: ");
                    int length = scanner.nextInt();
                    arrayDemo.createArray(length);
                    System.out.println("Array created successfully");
                    break;
                case 2:
                    arrayDemo.displayArray();
                    break;
                case 3:
                    System.out.println("Bye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice...");
            }
        } while (choice != 0);

    }
}
