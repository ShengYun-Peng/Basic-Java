package chap19;

public abstract class GenericMatrix <E extends Number> {
    // adding two elements in the matrix
    public abstract E add(E element1, E element2);
    public abstract E multiply(E element1, E element2);
    public abstract E zero();

    public E[][] addMatrix(E[][] m1, E[][]m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length)
            throw new RuntimeException("The matrices don't have the same size!");

        E[][] m3 = (E[][]) new Number[m1.length][m1[0].length];
        for (int i = 0 ; i < m1.length; ++i) {
            for (int j = 0; j < m1[0].length; ++j) {
                m3[i][j] = add(m1[i][j], m2[i][j]);
            }
        }
        return m3;
    }

    public E[][] multiplyMatrix(E[][] m1, E[][] m2) {
        if (m1[0].length != m2.length)
            throw new RuntimeException("The matrices don't have the compatible size!");

        E[][] m3 = (E[][]) new Number[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; ++i) {
            for (int j = 0 ; j < m2[0].length; ++j) {
                E tempSum = zero();
                for (int k = 0; k < m2.length; ++k) {
                    tempSum = add(tempSum, multiply(m1[i][k], m2[k][j]));
                }
                m3[i][j] = tempSum;
            }
        }
        return m3;
    }

    public static void printResult(Number[][] m1, Number[][] m2, Number[][] m3, char op) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++)
                System.out.print(" " + m1[i][j]);

            if (i == m1.length / 2)
                System.out.print(" " + op + " ");
            else
                System.out.print("   ");

            for (int j = 0; j < m2.length; j++)
                System.out.print(" " + m2[i][j]);
            if (i == m1.length / 2)
                System.out.print(" = ");
            else
                System.out.print("   ");

            for (int j = 0; j < m3.length; j++)
                System.out.print(m3[i][j] + " ");
            System.out.println();
        }
    }
}

