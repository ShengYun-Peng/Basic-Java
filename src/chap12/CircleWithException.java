package chap12;

public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithException() {
        this(1.0);
    }

    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius < 0) {
            throw new IllegalArgumentException("The radius cannot be negative!");
        }
        this.radius = radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException circle1 = new CircleWithException(5);
            CircleWithException circle2 = new CircleWithException(-5);
            CircleWithException circle3 = new CircleWithException(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }

        System.out.println(CircleWithException.getNumberOfObjects());
    }
}
