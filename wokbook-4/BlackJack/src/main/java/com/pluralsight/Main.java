package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player1 please enter you name: ");
      String Player1 = scanner.nextLine();
        System.out.println("Player2 please enter your name: ");
       String Player2 = scanner.nextLine();



        Deck deck = new Deck();
        deck.shuffle();
        
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();




    }


}
