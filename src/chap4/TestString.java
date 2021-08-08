package chap4;

public class TestString {
    public static void main(String[] args) {
        String s1 = "welcome to Java";
        String s2 = "Welcome to java";
        String s3 = "welcome to Java";
        System.out.println("s1 and s2: " + s1.equals(s2));
        System.out.println("s1 and s2: case insensitive " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 and s3: " + s1.equals(s3));
    }
}
