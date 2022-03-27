package com.company;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn() {
        return 2 * getArea() * height;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius = "
                + getRadius() +
                ", color = "
                + getColor() +
                " and height = "
                + height;
    }
}
