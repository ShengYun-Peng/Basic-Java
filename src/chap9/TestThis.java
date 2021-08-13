package chap9;

public class TestThis {
    private int value;
    private static double radius;

    public TestThis(int value) {
        this.value = value;
    }

    public TestThis(int value, double radius) {
        this(value);
        TestThis.radius = radius;
    }

    public TestThis() {
        this(13);
    }

    public int getValue() {
        return value;
    }

    public double getRadius() {
        return radius;
    }
}

class Test {
    public static void main(String[] args) {
        TestThis testThis = new TestThis();
        System.out.println(testThis.getValue() + " " + testThis.getRadius());
    }
}
