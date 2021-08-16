package chap13;

public class ComparableCircle extends Circle implements Comparable<Circle> {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Circle o) {
        if (getArea() < o.getArea())
            return -1;
        else if (getArea() > o.getArea())
            return 1;
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        return getArea() == ((ComparableCircle) o).getArea();
    }

    @Override
    public String toString() {
        return super.toString() + "\nCircle area: " + getArea();
    }

    public static void main(String[] args) {
        ComparableCircle circle1 = new ComparableCircle(2);
        ComparableCircle circle2 = new ComparableCircle(3);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println("Comparison: " + circle1.compareTo(circle2));
    }
}

