package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String [] names = new String [5];
        names[0] = "Raymond";
        names[1] = "Adam";
        names[2] = "Adam";
        names[3] = "Adam";

       /* for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);*/




        List <Integer> numbers = new ArrayList<>();

        List <String> kids = new ArrayList<>();
        kids.add("Nathalie ");
        kids.add("Bob");
        kids.add("Zachary");

        for (int i = 0; i <kids.size() ; i++) {
            System.out.println(kids.get(i));

        }

        System.out.println("=======================================================");
        kids.set(2,"Zach");

        for (int i = 0; i < kids.size(); i++) {
            System.out.println((i + 1) + " : " + kids.get(i));
        }

        System.out.println("=======================================================");







    }
}
