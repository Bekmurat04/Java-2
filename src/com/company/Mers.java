package com.company;

import java.sql.SQLOutput;

public class Mers extends Car implements Printable {
    private int year;

    public Mers(String engine, int year) {
        super(engine);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void print()  {
        System.out.println("двигатель:  " + super.getEngine() + "год:  " + getYear());
    }
}
