package chap11;

public class EqualMethod {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(1);
        GeometricObject circle2 = new Circle(1);
        GeometricObject circle3 = new Circle(2);
        GeometricObject rectangle = new Rectangle(2, 4);

        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.equals(circle3));
        System.out.println(circle1.equals(rectangle));
    }
}
