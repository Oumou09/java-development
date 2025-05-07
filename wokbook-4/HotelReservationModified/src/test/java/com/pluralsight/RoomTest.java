package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @Test
   public  void checkIn_RoomIsDirtyAndIsOccupied() {

        //arrange
        Room room = new Room(1,150);

        //act
        room.checkIn();


        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
   public void checkout() {
        //arrange
        Room room = new Room(2,300);
        room.checkIn();

        //act
        room.checkout();

        //assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanRoom_RoomPreviouslyUsed_RoomIsDirty() {
        //Arrange
        Room room = new Room(2,300);
        room.checkIn();
        room.checkout();

        //Act
        room.cleanRoom();

        //Assert
        assertFalse(room.isDirty());





    }
}