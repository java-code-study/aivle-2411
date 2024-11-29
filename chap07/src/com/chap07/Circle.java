package com.chap07;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    void draw() {
        System.out.println("원을 그림. 반지름 : " + radius);
    }
}
