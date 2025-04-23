package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the name of the story file:");
        String fileName = scanner.nextLine();


        try {
            FileInputStream fis = new FileInputStream(fileName);
            Scanner fileScanner = new Scanner(fis);
            int lineNumer = 1;
            while (fileScanner.hasNextLine()) {
                String Line = fileScanner.nextLine();
                System.out.println("%d. %s%n" + lineNumer + Line);
                lineNumer++;

            }
            Scanner.close();
        } catch (Exception exception) {
            System.out.println("File not found." + fileName);
        }
    }
}
