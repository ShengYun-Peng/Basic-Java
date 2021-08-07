package chap4;

public class ComputeAngle {
    public double computeLength(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public double computeAngle(double a, double b, double c) {
        return Math.acos((a * a - b * b - c * c) / (-2 * b * c));
    }

    public static void main(String[] args) {

    }
}
