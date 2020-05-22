package com.kitchen.staff;

import java.util.Date;

public class Chef extends Employee {
    private boolean isItCooking = true;

    public Chef(String name, Date birthsDate, double salary) {
        super(name, birthsDate, salary);
    }

    public void setIsItCooking(boolean itCooking) {
        isItCooking = itCooking;
    }


    public boolean getIsItCooking(){
        return this.isItCooking;
    }



    @Override
    public double taxReport() {
        return super.taxReport();
    }

    @Override
    public String toString() {
        return "Chef{" +super.toString()+
                "isItCooking=" + isItCooking +
                ", receiveKnife=" +'}';
    }
}
