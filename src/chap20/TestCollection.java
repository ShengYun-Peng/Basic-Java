package chap20;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");
        System.out.println(collection1);

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");
        System.out.println(collection2);

        // element in collection1 or collection2 (with repetition)
        ArrayList c1 = (ArrayList<String>) collection1.clone();
        c1.addAll(collection2);
        System.out.println(c1);

        // element in collection1 and collection2
        c1 = (ArrayList) collection1.clone();
        c1.retainAll(collection2);
        System.out.println(c1);

        // element in collection1 but not in collection2
        c1 = (ArrayList) collection1.clone();
        c1.removeAll(collection2);
        System.out.println(c1);
    }
}
