package com.kitchen.staff;

import java.util.Date;

public abstract class Employee {
    private String name;
    private Date birthsDate;
    private double salary;

    public Employee(String name, Date birthsDate, double salary){
        this.name = name;
        this.birthsDate = birthsDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Date getBirthsDate() {
        return birthsDate;
    }

    public double getSalary() {
        return salary;
    }

    public double taxReport(){
        return salary*0.99;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthsDate=" + birthsDate +
                ", salary=" + salary +
                '}';
    }
}
