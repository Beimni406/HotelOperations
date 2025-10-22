package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double lastPunchInTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void punchIn(double time) {
        lastPunchInTime = time;
        System.out.println(name + " punched in at " + time);
    }

    public void punchOut(double time) {
        double hours = time - lastPunchInTime;
        hoursWorked += hours;
        System.out.println(name + " punched out at " + time + " | Hours worked: " + hours);
    }
}
