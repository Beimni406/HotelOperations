package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Pluralsight Inn", 5, 10);
        hotel.bookRoom(2, true);  // book 2 suites
        hotel.bookRoom(3, false); // book 3 basic rooms

        System.out.println("Available suites: " + hotel.getAvailableSuites());
        System.out.println("Available rooms: " + hotel.getAvailableRooms());
    }
}
