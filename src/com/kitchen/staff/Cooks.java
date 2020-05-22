package com.kitchen.staff;

import java.util.Date;

public class Cooks extends Employee {
    private boolean receivedKnifeSet = false;


    public Cooks(String name, Date birthsDate, double salary) {
        super(name, birthsDate, salary);
    }

    public void setReceivedKnifeSet(boolean receivedKnifeSet) {
        this.receivedKnifeSet = receivedKnifeSet;
    }

    public boolean hasReceivedKnife() {
        return receivedKnifeSet;
    }

    @Override
    public String toString() {
        return "Cooks{" + super.toString()+
                "receivedKnifeSet=" + receivedKnifeSet +
                '}';
    }
}
