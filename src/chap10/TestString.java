package chap10;

public class TestString {
    public static void main(String[] args) {
        char[] array = "welcome to java".toCharArray();
        String string = new String(array);
        System.out.println(string);

        // interned string
        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3 = "Welcome to Java";

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));

        String format = String.format("%6.2f%5d---%-5send", 34.234234, 12, "AS");
        System.out.println(format);
    }
}
