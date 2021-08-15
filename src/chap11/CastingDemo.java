package chap11;

public class CastingDemo {
    public static void displayObject(GeometricObject object) {
        if (object instanceof Circle) {
            System.out.println("The diameter is: " + ((Circle) object).getDiameter());
            System.out.println("The area of the circle is: " + ((Circle) object).getArea());
        } else if (object instanceof Rectangle) {
            System.out.println("The area of the rectangle is: " + ((Rectangle) object).getArea());
        }
    }

    public static void main(String[] args) {
        GeometricObject circle = new Circle(1);
        GeometricObject rectangle = new Rectangle(2, 4);

        displayObject(circle);
        displayObject(rectangle);
    }
}
