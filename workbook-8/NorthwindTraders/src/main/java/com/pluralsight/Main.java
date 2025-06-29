package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "yearup24"
        );

        Statement statement = connection.createStatement();
        String query = """
               SELECT ProductName
               FROM Products
               """;


        ResultSet result = statement.executeQuery(query);


        while(result.next()){
            String productName = result.getString("ProductName");
            System.out.println(productName);
        }



        connection.close();


    }
}
