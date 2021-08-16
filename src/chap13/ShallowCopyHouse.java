package chap13;

import java.util.Date;

public class ShallowCopyHouse implements Cloneable, Comparable<ShallowCopyHouse> {
    private int id;
    private double area;
    private Date whenBuilt;

    public ShallowCopyHouse(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public int compareTo(ShallowCopyHouse o) {
        return Double.compare(area, o.getArea());
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "House: " + area + " date: " + whenBuilt;
    }
}

class TestShallowCopy {
    public static void main(String[] args) {
        ShallowCopyHouse h1 = new ShallowCopyHouse(1, 1600.23);
        ShallowCopyHouse h2 = (ShallowCopyHouse) h1.clone();
        System.out.println(h1);
        System.out.println(h2);
        System.out.println();

        // though copied, but it is shallow copy, changing h1/h2 will change the date of the other
        h1.getWhenBuilt().setTime(12345678);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println();

        h2.getWhenBuilt().setTime(87654321);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println();

    }
}
