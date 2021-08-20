package chap20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + " ");
        }
        System.out.println();

        // the code above is the same as below
        for (String s : collection)
            System.out.print(s.toUpperCase() + " ");
        System.out.println();

        // another version
        collection.forEach(e -> System.out.print(e.toUpperCase() + " "));
        System.out.println();
    }
}
