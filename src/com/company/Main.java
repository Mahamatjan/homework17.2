package com.company;

public class Main {
    public static void main(String[] args) {
        Squar squar = new Squar(6);
        System.out.println("squar ="+" "+ squar.getPerimeter());

        tringle tringle = new tringle(16,16,16);
        System.out.println("tringle ="+" "+tringle.getPerimeter());

        Rectangle rectangle = new Rectangle(5,5,5,5);
        System.out.println("rectengle ="+" "+rectangle.getPerimeter());

        Rhombus rhombus = new Rhombus(4,4,4,4);
        System.out.println("rhombus ="+" "+rhombus.getPerimeter());

        Cirle cirle = new Cirle(5);
        System.out.println("Cirle = "+" "+cirle.getPerimeter());

        Trapeziod trapeziod = new Trapeziod(3,3,3,3);
        System.out.println("trapeziod = "+" "+trapeziod.getPerimeter());


    }
}