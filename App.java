/*
 * Name: Patrick Gonzalez
 * Date: 2026-03-10
 * Assignment: SDC230 Performance Assessment - Smallest Number
 * Description: This program asks the user how many integers they want to enter,
 * then uses a loop to collect those integers and determines the smallest value entered.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Patrick Gonzalez - Week 2 PA Smallest Number");
        System.out.println();
        System.out.println("Finding the Smallest Value:");

        System.out.print("How many integers would you like to enter: ");
        int count = input.nextInt();

        int smallest = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter an integer value: ");
            int number = input.nextInt();

            if (i == 1) {
                smallest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("The smallest value entered is: " + smallest);

        input.close();
    }
}