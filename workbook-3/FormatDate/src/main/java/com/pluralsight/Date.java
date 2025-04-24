package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDateTime todayDate = LocalDateTime.now();
        ZonedDateTime localZone = todayDate.atZone(ZoneId.systemDefault());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("E, MMMM d, yyyy HH:mm");


        System.out.println(" Today's day is: " + todayDate.format(dateTimeFormatter));
        System.out.println(" Today's day is: " + todayDate.format(dateTimeFormatter2));
        System.out.println("Today's day is: " + todayDate.format(dateTimeFormatter3));
        System.out.println("Today's day is: " + todayDate.format(dateTimeFormatter4));

    }

}
