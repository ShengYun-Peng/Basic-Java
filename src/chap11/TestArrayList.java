package chap11;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("London");
        arrayList.add("Denver");
        arrayList.add("Paris");
        arrayList.add("Miami");
        arrayList.add("Seoul");
        arrayList.add("Tokyo");

        System.out.println("Size: " + arrayList.size());
        System.out.println("Miami? " + arrayList.contains("Miami"));
        System.out.println("Denver: " + arrayList.indexOf("Denver"));

        arrayList.add(2, "Atlanta");
        System.out.println(arrayList.remove("Miami"));
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
