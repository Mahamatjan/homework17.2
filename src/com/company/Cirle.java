package com.company;

public class Cirle extends Shape{
    private  int r;
    private  double PI = 3.14;

    public Cirle(int r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*r;
    }
}
