package com.pluralsight;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> statesAndCapitals = new HashMap<>();
        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("WA", "Olympia");
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");

        System.out.println(statesAndCapitals);

        System.out.print("The capital of Texas is: ");
        System.out.println(statesAndCapitals.get("TX"));


    }
}
