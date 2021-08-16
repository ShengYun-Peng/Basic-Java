package chap13;

import java.util.Date;

public class DeepCopyHouse implements Cloneable, Comparable<DeepCopyHouse> {
    private int id;
    private double area;
    private Date whenBuilt;

    public DeepCopyHouse(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    @Override
    public Object clone() {
        try {
            DeepCopyHouse houseClone = (DeepCopyHouse) super.clone();
            houseClone.whenBuilt = (Date) whenBuilt.clone();
            return houseClone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public int compareTo(DeepCopyHouse o) {
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

class TestDeepCopy {
    public static void main(String[] args) {
        DeepCopyHouse h1 = new DeepCopyHouse(1, 1600.23);
        DeepCopyHouse h2 = (DeepCopyHouse) h1.clone();
        System.out.println(h1);
        System.out.println(h2);
        System.out.println();

        // deep copy creates two separate instances
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

