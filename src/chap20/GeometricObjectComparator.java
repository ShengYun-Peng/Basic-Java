package chap20;

import chap13.GeometricObject;

import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject> {
    @Override
    public int compare(GeometricObject o1, GeometricObject o2) {
        double q1 = o1.getArea();
        double q2 = o2.getArea();

        return Double.compare(q1, q2);
    }
}
