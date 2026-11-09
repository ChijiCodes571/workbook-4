package com.pluralsight.hotel;

public class Room {

    boolean occupied;
    int numberOfBeds;
    int roomNumber;

    public boolean isOccupied() {
        return this.occupied;
    }

    public int getFloor(){
        int floor = this.roomNumber /10;
        return floor;
    }

    public boolean isFree(){
        if (this.occupied == true) {
            return false;
        }
        else{
            return true;
        }
    }
}
