package com.pluralsight.Sandwich;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        // Prompt User for Sandwich Size
        Scanner scanner = new Scanner(System.in);
        System.out.println(" A small sandwich cost about $5.45 and a large sandwich cost $8.95 ");
        System.out.println(" Please choose a sandwich between small and large: ");
        int sandwichSize = scanner.nextInt();

//Calculate Base Price
        double basePrice = 0;

        if (sandwichSize == 1) {
             basePrice = 5.45;
        } else if (sandwichSize == 2) {
             basePrice = 8.85;
        } else {
            System.out.println(" Please enter 1 or 2");
            return;
        }
//Prompt User for age
        System.out.println(" What is your age: ");
        int age = scanner.nextInt();

// Calculate Discount percentage
        double discountedPercentage = 0.0;
        if (age <= 17) {
            discountedPercentage = 0.1;
        } else if (age >= 65) {
            discountedPercentage = 0.2;
        }

// Calculate Final Price:
        double  totalPrice = basePrice * (1 -discountedPercentage);

// Display cost of sandwich
        System.out.printf(" Cost of sandwich: $%.2f%n ", totalPrice);

        scanner.close();

        }






}
