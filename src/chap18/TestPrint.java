package chap18;

public class TestPrint {
    public static void nPrintln(int n, String message) {
        if (n >= 1) {
            System.out.println(message);
            nPrintln(n - 1, message);
        }
    }

    public static void main(String[] args) {
        nPrintln(3, "Hello!");
    }
}
