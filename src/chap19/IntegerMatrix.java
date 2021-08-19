package chap19;

public class IntegerMatrix extends GenericMatrix<Integer> {
    @Override
    public Integer add(Integer element1, Integer element2) {
        return element1 + element2;
    }

    @Override
    public Integer multiply(Integer element1, Integer element2) {
        return element1 * element2;
    }

    @Override
    public Integer zero() {
        return 0;
    }

    public static void main(String[] args) {
        Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
        Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};

        // Create an instance of IntegerMatrix
        IntegerMatrix integerMatrix = new IntegerMatrix();
        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(
                m1, m2, integerMatrix.addMatrix(m1, m2), '+');
        System.out.println("\nm1 * m2 is ");
        GenericMatrix.printResult(
                m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');
    }
}
