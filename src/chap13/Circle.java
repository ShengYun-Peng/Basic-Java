package chap13;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return super.toString() + "\nCircle radius: " + radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("The area is: " + circle.getArea());
    }
}
