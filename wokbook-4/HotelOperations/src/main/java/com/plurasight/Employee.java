package com.plurasight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;


    }

    public double getRegularHours(){
        if (hoursWorked <= 40){
            return hoursWorked;
        }else {
            return 40;
        }

    }
//    public double getTotalPay(){
//        if (hoursWorked <= 40){
//            return hoursWorked * payRate;
//        }else{
//            return (40 * payRate) + ((hoursWorked - 40) * (payRate * 1.5));
//
//        }

    public double getTotalPay(){
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);

    }
    public double getOvertimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }else {
            return 0;
        }
    }
}