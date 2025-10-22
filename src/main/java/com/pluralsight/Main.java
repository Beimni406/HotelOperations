package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, 150, false, false);
        room1.checkIn();
        room1.checkOut();
        room1.cleanRoom();

        Employee emp1 = new Employee(101, "Alice", "Front Desk", 20.00, 0.0);
        emp1.punchIn(10.0);
        emp1.punchOut(14.75);
        System.out.println("Total hours worked: " + emp1.getHoursWorked());
    }
}
