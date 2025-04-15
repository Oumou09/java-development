package com.pluralsight;

import java.sql.SQLOutput;

public class MathApp {
    public static void main(String[] args) {
//

       //Question 1:
        int bobSalary = 50000;
        int garySalary = 75000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("Highest Salary is:" + highestSalary);

        //Question 2:
        int carPrice = 5000;
        int truckPrice = 10000;
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println(smallestPrice);

        //Question 3:
        double circleRadius = 7.25;
        double circleArea = (Math.pow(circleRadius, 2)) * Math.PI;
        System.out.println("Area circle:" + circleArea);

        //Question 4:
        double num1 = 5.0;
        double sqrtNum1 = Math.sqrt(num1);
        System.out.println(" The square root of " + num1 + " is " + sqrtNum1);   //

        //Question 5:
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(" The distance between the point is: " + distance);

        //Question 6:
        double num2 = -3.8;
        double absNum2 = Math.abs(num2);
        System.out.println(" The absolute value of " + num2 + " is " +absNum2);

        //Question 7:
        double randomNum = Math.random();
        System.out.println(" The random number is " + randomNum);













    }
}
