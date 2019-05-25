package com.children;

import java.util.Date;

import com.parent.Vechile;

public class Car extends Vechile {

    public Car(int id, String name, String milage, Date date) {
        super(id, name, milage, date);
    }
    
    
    public Car() {
    }


   @Override
    public  String checkMilage() {
        return "200kmpl";
    }

}
