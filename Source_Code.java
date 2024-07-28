
// set the package name
package com.dellpogie;

// add reference to the Java Standard Library
import java.util.Scanner;

// create a multiplication table class
public class MultiplicationTable {

    // entry point in Java
    public static void main(String[] args) {

        // user input listener
        Scanner scanner = new Scanner(System.in);

        // display details intro
        System.out.println("\nDellPogie 2024 - Java Portfolio using the Java Standard Library\n");
        System.out.println("RESIZABLE MULTIPLICATION TABLE\n");

        // ask the user to input the table size
        System.out.print("Enter the size of the multiplication table: ");

        // scan for user input
        int size = scanner.nextInt();

        System.out.println("Multiplication Table:");

        // print the top row
        System.out.print(" x");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // print the table
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d", i); // print the left column
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        // aesthetics
        System.out.println("\n");

        // clear the memory
        scanner.close();

    }
}
