package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("   ");
        System.out.println(" Rectangle 1:  ");
        System.out.println(" Enter the length of the rectangle: ");
        int length1 = scanner.nextInt();

        System.out.println(" Enter the width of the rectangle: ");
        int width1 = scanner.nextInt();

        int area1 = length1 * width1;
        int perimeter1 = 2 * (length1 + width1);

        System.out.println(" The length is: " + length1);
        System.out.println(" The width is: " + width1);
        System.out.println(" The area is: " + area1);
        System.out.println(" The perimeter is: " + perimeter1);


        System.out.println("   ");
        System.out.println(" Rectangle 2:  ");
        System.out.println(" Enter the length of the rectangle: ");
        int length2 = scanner.nextInt();

        System.out.println(" Enter the width of the rectangle: ");
        int width2 = scanner.nextInt();

        int area2 = length2 * width2;
        int perimeter2 = 2 * (length2 + width2);

        System.out.println(" The length is: " + length2);
        System.out.println(" The width is: " + width2);
        System.out.println(" The area is: " + area2);
        System.out.println(" The perimeter is: " + perimeter2);

    }
    public static void calculateRectangleInfo(int length, int width){

    }





}
