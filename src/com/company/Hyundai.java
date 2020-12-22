package com.company;

public class Hyundai extends Car implements Printable {
    private String window;

    public Hyundai(String engine, String window) {
        super(engine);
        this.window = window;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }



    @Override
    public void print() {
        System.out.println("двигатель:  " + super.getEngine() + "окно:  " + getWindow());

    }
}
