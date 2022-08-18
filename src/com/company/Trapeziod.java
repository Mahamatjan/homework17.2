package com.company;

public class Trapeziod extends  Shape{
    private  int a;
    private  int n;
    private  int m;
    private  int j;

    public Trapeziod(int a, int n, int m, int j) {
        this.a = a;
        this.n = n;
        this.m = m;
        this.j = j;
    }

    @Override
    public double getPerimeter() {
        return a+n+m+j;
    }
}
