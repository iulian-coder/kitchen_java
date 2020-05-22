package com.kitchen;

import com.kitchen.staff.Chef;
import com.kitchen.staff.Cooks;
import com.kitchen.staff.KitchenHelper;

import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        KitchenHelper helper1 = new KitchenHelper("Ion",new Date(1980-01-20),38.9);
        Cooks cooks1 = new Cooks("Halal", new Date(2004-11-11),74.2);
        Chef chef1 = new Chef("Paul", new Date(200-10-11),77);

    }
}
