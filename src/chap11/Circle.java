package chap11;

import java.security.interfaces.RSAKey;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() { }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public boolean equals(Object c) {
        if (c instanceof Circle)
            return radius == ((Circle) c).getRadius();
        else
            return false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void printCircle() {
        System.out.println("The circle is created on: " + getDateCreated() + " and the radius is " + radius);
    }
}
