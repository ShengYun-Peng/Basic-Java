package chap9;

public class Circle {
    // static means this variable is shared among different classes
    private double radius;
    private static int numberOfObjects = 0;

    public Circle() {
        radius = 1.0;
        ++numberOfObjects;
    }

    public Circle(double radius) {
        this.radius = radius;
        ++numberOfObjects;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0 ? newRadius : 0);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(Circle.getNumberOfObjects());
        Circle circle2 = new Circle(2);
        System.out.println(Circle.getNumberOfObjects());
    }
}
