package com.company;

public class Squar extends  Shape{
    private int x;



    public Squar(int x) {
        this.x = x;
    }
    @Override
    public double getPerimeter(){
        return x*4;
    }

}
