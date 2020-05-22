package com.kitchen.staff;

import com.kitchen.staff.Employee;

import java.util.Date;
import java.util.Random;

public class KitchenHelper extends Employee {
    Random random = new Random();

    private int itemCarrot = random.nextInt(4);
    private int itemPotato = random.nextInt(4);
    private int itemMeat =random.nextInt(4);


    public KitchenHelper(String name, Date birthsDate, double salary) {
        super(name, birthsDate, salary);
    }


    @Override
    public double taxReport() {
        return super.taxReport();
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
