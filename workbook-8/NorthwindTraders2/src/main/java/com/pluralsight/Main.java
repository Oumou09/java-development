package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean running = false;
        while (!running) {
            System.out.println("------Welcome!-------");
            System.out.println("What would you like to day?");
            System.out.println("1) Display all products");
            System.out.println("2) Display all customer");
            System.out.println("0) Exist");
            System.out.println("Select an option: ");
            System.out.println("--------------------------------------");


            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    displayAllProducts();
                    break;
                case "2":
                    displayAllCustomer();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");



            }
        }
    }
       private static void displayAllProducts() {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet results = null;
            try {
                // load the MySQL Driver
                Class.forName("com.mysql.cj.jdbc.Driver");


                // 1. open a connection to the database
                // use the database URL to point to the correct database
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind",
                        "root",
                        "yearup24");


                // define your query
                String query = """
                        SELECT ProductID, ProductName, UnitPrice, UnitsInStock  
                        FROM Products""";

                // create statement
                // the statement is tied to the open connection
              preparedStatement = connection.prepareStatement(query);

                // 2. Execute your query
                results = preparedStatement.executeQuery(query);

                // process the results
                while (results.next()) {
                    int productID = results.getInt("ProductID");
                    String productName = results.getString("ProductName");
                    double unitPrice = results.getDouble("UnitPrice");
                    int unitsInStock = results.getInt("UnitsInStock");


                    System.out.println("Product ID: " + productID);
                    System.out.println("Product Name: " + productName);
                    System.out.println("Unit Price: " + unitPrice);
                    System.out.println("Units In Stock: " + unitsInStock);
                    System.out.println("------------------------------------------------------------");
                }



            } catch (Exception ex) {
                System.out.println("An error has occurred");
                ex.printStackTrace();
            }finally {
                if (results != null) {
                    try {
                        results.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }



            }

        }

        private static void displayAllCustomer() {
            Connection connection = null;
            PreparedStatement preparedStatement = null;
            ResultSet results = null;
            try {
                // load the MySQL Driver
                Class.forName("com.mysql.cj.jdbc.Driver");


                // 1. open a connection to the database
                // use the database URL to point to the correct database
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind",
                        "root",
                        "yearup24");


                // define your query
                String query = """
                        SELECT CompanyName, ContactName, City, Country, Phone  
                        FROM Customers""";

                // create statement
                // the statement is tied to the open connection
                preparedStatement = connection.prepareStatement(query);

                // 2. Execute your query
                results = preparedStatement.executeQuery(query);

                // process the results
                while (results.next()) {
                    String companyName = results.getString("CompanyName");
                    String contactName = results.getString("ContactName");
                    String City = results.getString("City");
                    String Country= results.getString("Country");
                    String Phone = results.getString("Phone");



                    System.out.println("CompanyName: " + companyName);
                    System.out.println("Unit Price: " + contactName);
                    System.out.println("City: " + City);
                    System.out.println("Country: " + Country);
                    System.out.println("Phone: " + Phone);
                    System.out.println("------------------------------------------------------------");
                }


            } catch (Exception ex) {
                System.out.println("An error has occurred");
                ex.printStackTrace();
            } finally {
                if (results != null) {
                    try {
                        results.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

            }

        }

}