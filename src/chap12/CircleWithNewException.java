package chap12;

public class CircleWithNewException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithNewException() throws InvalidRadiusException {
        this(1.0);
    }

    public CircleWithNewException(double radius) throws InvalidRadiusException {
        setRadius(radius);
        numberOfObjects++;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius < 0) {
            throw new InvalidRadiusException(radius);
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

class TestCircleWithNewException {
    public static void main(String[] args) {
        try {
            CircleWithNewException circle1 = new CircleWithNewException(5);
            CircleWithNewException circle2 = new CircleWithNewException(-5);
            CircleWithNewException circle3 = new CircleWithNewException(0);
        } catch (InvalidRadiusException ex) {
            ex.printStackTrace();
            System.out.println(ex);
        }

        System.out.println(CircleWithNewException.getNumberOfObjects());
    }
}
