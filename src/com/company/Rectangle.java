package com.company;

public class Rectangle extends Shape{
    private int n;
    private int f;
    private int z;
    private int t;

    public Rectangle(int n, int f, int z, int t) {
        this.n = n;
        this.f = f;
        this.z = z;
        this.t = t;
    }

    @Override
    public double getPerimeter() {
        return n+f+z+t;
    }

}
