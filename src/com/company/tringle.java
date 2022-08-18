package com.company;

public class tringle extends Shape{
    private int z;
    private int a;
    private int p;

    public tringle(int z, int a, int p) {
        this.z = z;
        this.a = a;
        this.p = p;
    }

    @Override
    public double getPerimeter() {
        return z+a+p;
    }
}
