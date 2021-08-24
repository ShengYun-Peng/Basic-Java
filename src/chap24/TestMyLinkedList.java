package chap24;

import java.util.Iterator;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();

        list.add("America");
        list.add("Canada");
        list.add(0, "France");
        list.add(2, "Germany");
        System.out.println(list);
        System.out.println(list.get(3));

        System.out.print("Index: ");
        System.out.print(list.indexOf("Canada"));
        System.out.println(" " + list.indexOf("China"));

        System.out.print("Contains: ");
        System.out.println(list.contains("Germany"));

        MyList<String> list1 = new MyLinkedList<>();
        list1.add("America");
        list1.add("Canada");
        System.out.print("Contains all: ");
        System.out.print(list.containsAll(list1));
        list1.add("China");
        System.out.println(" " + list.containsAll(list1));

        list.addAll(list1);
        System.out.println(list);

        list.remove("America");
        System.out.println(list);
        System.out.println(list.lastIndexOf("America"));

        list.remove(0);
        System.out.println(list);

        for (String s : list)
            System.out.print(s.toUpperCase() + " ");
        System.out.println();

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == "America")
                iterator.remove();
        }
        System.out.println(list);

    }
}
