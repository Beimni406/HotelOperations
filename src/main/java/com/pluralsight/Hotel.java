package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // Constructor 1 - only total suites and rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // Constructor 2 - specify already booked rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // Book a room
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (bookedSuites + numberOfRooms <= numberOfSuites) {
                bookedSuites += numberOfRooms;
                System.out.println(numberOfRooms + " suite(s) booked.");
                return true;
            } else {
                System.out.println("Not enough suites available.");
                return false;
            }
        } else {
            if (bookedBasicRooms + numberOfRooms <= this.numberOfRooms) {
                bookedBasicRooms += numberOfRooms;
                System.out.println(numberOfRooms + " basic room(s) booked.");
                return true;
            } else {
                System.out.println("Not enough basic rooms available.");
                return false;
            }
        }
    }

    // Derived getters (calculated)
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    public String getName() {
        return name;
    }
}
