package chap10;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("welcome ");
        stringBuilder.append("to ");
        stringBuilder.append("java");
        System.out.println(stringBuilder);

        stringBuilder.insert(11, "html and ");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
        stringBuilder.trimToSize();
        System.out.println(stringBuilder.capacity());
    }
}
