package chap18;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int numberOfDisks = 4;
        moveDisks(numberOfDisks, "A", "B", "C");
    }

    private static void moveDisks(int n, String fromTower, String toTower, String auxTower) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromTower + " to " + toTower);
        } else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
