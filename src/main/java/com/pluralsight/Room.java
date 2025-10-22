package com.pluralsight;

public class Room {
    private int beds;
    private double rate;
    private boolean occupied;
    private boolean dirty;

    public Room(int beds, double rate, boolean occupied, boolean dirty) {
        this.beds = beds;
        this.rate = rate;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public boolean isOccupied() { return occupied; }
    public boolean isDirty() { return dirty; }

    public void checkIn() {
        if (!occupied && !dirty) {
            occupied = true;
            dirty = true;
            System.out.println("Guest checked in. Room is now occupied and dirty.");
        } else {
            System.out.println("Cannot check in: room is either dirty or already occupied.");
        }
    }

    public void checkOut() {
        if (occupied) {
            occupied = false;
            dirty = true;
            System.out.println("Guest checked out. Room is now vacant and dirty.");
        } else {
            System.out.println("Cannot check out: room is already vacant.");
        }
    }

    public void cleanRoom() {
        if (!occupied) {
            dirty = false;
            System.out.println("Room has been cleaned.");
        } else {
            System.out.println("Cannot clean: room is occupied.");
        }
    }
}
