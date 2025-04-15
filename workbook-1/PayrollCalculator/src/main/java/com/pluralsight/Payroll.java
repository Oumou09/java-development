package com.pluralsight;

import java.util.Scanner;


public class Payroll {
    private static int hours;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please write your name: ");
        String name = scanner.nextLine();

        System.out.println(" Hello " + name+  " Please put the Hours you Worked: ");
        int num = scanner.nextInt();

        System.out.println(" Enter Your Hourly Wage ");
        int wage = scanner.nextInt();
        int grossPay = num * wage;
        System.out.println( name + " worked " + wage + "Their Pay is: " + grossPay );

        int rate = 32.98;
        if (hours > 40) {
            grossPay = 40 * rate * (hours - 40) * 1.5 * rate;
        } else {
            grossPay = hours * rate;

        }










    }
}
