package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
  List<Product> inventory = getInventory();


  listAllProducts(inventory);

        try{
            BufferedReader reader = new BufferedReader( new FileReader("inventory.csv"));
            String line;
            while ((line = reader.readLine()!= null)) {
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[1]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                inventory.add(new Product(id, name, price));

                //System.out.println(line);

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        }


    public static List<Product> getInventory() throws RuntimeException {
        List<Product> inventory = new ArrayList<>();

        /*inventory.add(new Product(1,"Shirt", 19.99));
        inventory.add(new Product(2,"Pant", 29.99));
        inventory.add(new Product(4,"Shoes", 49.99));
        inventory.add(new Product(3,"Hat", 14.99));
        inventory.add(new Product(5,"Jacket", 79.99));*/


        // return inventory;


        return inventory;
    }

    public static void listAllProducts(List<Product> productsList) {
        System.out.println(" We carry the following inventory: ");
        for (Product product : productsList) {
            System.out.println(product);
    }



        }
    }
