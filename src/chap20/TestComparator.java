package chap20;

import chap13.Circle;
import chap13.GeometricObject;

import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle(5);
        GeometricObject g2 = new Circle(3);

        GeometricObject g = max(g1, g2, new GeometricObjectComparator());

        System.out.println(g.getArea());
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2, Comparator<GeometricObject> c) {
        if (c.compare(o1, o2) > 0)
            return o1;
        else
            return o2;
    }
}
