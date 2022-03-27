package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Circle
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.0, "white");
        System.out.println(circle);

        // Cylinder
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(5.0);
        System.out.println(cylinder);
        cylinder = new Cylinder(10.0, 5.0, "black");
        System.out.println(cylinder);
    }
}
