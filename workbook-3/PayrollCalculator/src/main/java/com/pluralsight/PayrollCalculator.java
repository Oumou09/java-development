package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name if the employee file to process: ");
        String inputFileName = scanner.nextLine();
        System.out.println("Enter the name of the payroll file to create: ");
        String outputFileName = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("Potatoes.cvs");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee( id, name, hoursWorked, payRate );

                bufferedWriter.write(String.format(".", employee.getEmployeeId(), employee.getEmployeeName(), employee.getGrossPay()));


                //Employee employee = new Employee(id, name, hoursWorked, payRate);
                //System.out.printf(" Employee ID: %d, Name: %s, Gross Pay: $%.2f%n", employee.getEmployeeId()
                      //  , employee.getEmployeeName(), employee.getGrossPay());



            }
            bufferedReader.close();
        } catch (Exception ex) {
            System.out.println(" An error has occurred!");
            ex.printStackTrace();


        }

    }

}


