package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @Test
   public  void checkIn_RoomNotIsDirty_And_IsOccupied_RoomIsAvailable() {

        //arrange
        Room room = new Room(1,150);

        //act
        room.checkIn();


        //assert
    }

    @Test
   public void checkout() {
    }

    @Test
    public void cleanRoom_RoomIsEmpty_RoomIsDirty() {
    }
}