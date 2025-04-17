package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheatreReservations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println( " Enter your name: ");
        String fullName = scanner.nextLine();

        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(  indexOfSpace + 1);


        System.out.println( " Enter the date you will be seeing the movie (MM/DD/YYYY) : ");
        String date = scanner.nextLine();

        //Parse the date using the DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "MM/dd/yyyy");
        LocalDate Date = LocalDate.parse(date, formatter);


        // Prompt the user for the number of tickets
        System.out.println(" Enter the number tickets you would like: ");
        int ticketAmount = Integer.parseInt(scanner.nextLine());

        String ticketString = ticketAmount == 1 ? " ticket ": " tickets ";
        String confirmationMessage = ticketAmount + ticketString + "reserved for" + date + " under " + lastName + " ," + firstName;
        System.out.println( confirmationMessage);

        scanner.close();






    }
}
