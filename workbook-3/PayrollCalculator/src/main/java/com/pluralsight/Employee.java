package com.pluralsight;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeePayRate;
    private double employeeHoursWorked;

    public Employee(int employeeId, String employeeName, double employeePayRate, double employeeHoursWorked) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePayRate = employeePayRate;
        this.employeeHoursWorked = employeeHoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeePayRate() {
        return employeePayRate;
    }

    public void setEmployeePayRate(double employeePayRate) {
        this.employeePayRate = employeePayRate;
    }

    public double getEmployeeHoursWorked() {
        return employeeHoursWorked;
    }

    public void setEmployeeHoursWorked(double employeeHoursWorked) {
        this.employeeHoursWorked = employeeHoursWorked;
    }

    public double getGrossPay(){
        return employeeHoursWorked * employeePayRate;
    }
}
