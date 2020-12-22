package com.company;

public class Toyota extends Car implements Printable {
    private String colour;

    public Toyota(String engine, String colour) {
        super(engine);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void print() {
        System.out.println("двигатель:  " + super.getEngine() + "цвет:  " + getColour() );

    }
}
