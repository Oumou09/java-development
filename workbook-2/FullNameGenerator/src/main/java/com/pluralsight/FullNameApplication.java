package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name:  ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name:  ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name:  ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your suffix name:  ");
        String suffix = scanner.nextLine();

        String fullName = firstName;


//System.out.println ( firstName + " " + middleName + " " +  lastName + " " + suffix + " ");


if(!middleName.isEmpty()){
    fullName = fullName + " " + middleName;
}
fullName = fullName + " "+ lastName;

if(!suffix.isEmpty()){
    fullName = fullName + " " + suffix;
}

System.out.println(" \nFull name: " + fullName );

/*if (firstName.isEmpty()){
       System.out.print(" You need a first name");
   }else
       System.out.print(" Invalid input");
if( lastName.isEmpty()){
    System.out.print("You need a last name ");
}else
    System.out.print(" invalid input");*/




    }




}
