package com.plurasight;

import java.util.jar.Attributes;

//Attributes
public class Room {
    private int numberOfBed;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

   //Constructor


    public Room(int numberOfBed, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBed = numberOfBed;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable(){
        return !isOccupied && !isDirty;
    }
}
