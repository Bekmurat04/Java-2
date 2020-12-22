package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Mers").print();
        createObject("Toyota").print();
        createObject("Hyundai").print();
    }

    public static Printable createObject(String className){
        Printable print = null;
switch (className){
    case "Mers":
        print  = new Mers("мощный ", 2017);
        break;
    case "Toyota":
        print = new Toyota("сочный  ", "зеленая");
        break;
    case "Hyundai":
        print = new Hyundai("двигатель  ", "матовое");
        break;
}
return print;





    }
}
