package chap11;

public class Polymorphism {
    public static void displayObject(GeometricObject object) {
        System.out.println(object);
    }

    public static void main(String[] args) {
        GeometricObject circle = new Circle(1);
        GeometricObject rectangle = new Rectangle(2, 4);

        displayObject(circle);
        System.out.println();

        // the dynamic binding concept is implemented here.
        // the subclass toString method is called
        displayObject(rectangle);
    }
}
