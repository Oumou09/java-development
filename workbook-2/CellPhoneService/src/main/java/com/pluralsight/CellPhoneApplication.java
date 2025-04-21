package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone oumouPhone = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your serial number: ");
        int serialNumberFromUser = scanner.nextInt();
        oumouPhone.setSerialNumber(serialNumberFromUser);
        scanner.nextLine();

        System.out.println("What is the model: ");
        String userModel = scanner.nextLine();
        oumouPhone.setModel(userModel);

        System.out.println("Who is your carrier: ");
        String userCarrier = scanner.nextLine();
        oumouPhone.setCarrier(userCarrier);

        System.out.println("What is your phone number: " );
        String userPhoneNumber = scanner.nextLine();
        oumouPhone.getPhoneNumber(userPhoneNumber);

        System.out.println("What is your name: ");
        String userName = scanner.nextLine();
        oumouPhone.getOwner(userName);

        scanner.close();

        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + oumouPhone.setSerialNumber());
        System.out.println("Model: " + oumouPhone.getModel ());
        System.out.println("Carrier: " + oumouPhone.getCarrier());
        System.out.println("Phone Number: " + oumouPhone.getPhoneNumber());
        System.out.println("Owner: " + oumouPhone.getOwner());
    }




}
