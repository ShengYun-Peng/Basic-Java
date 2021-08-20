package chap20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestArrayAndLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // 1 is autoboxed to new Integer(1)
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10);
        arrayList.add(3, 30);

        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");
        // this should not appear in linked list
        linkedList.add(1, "here");

        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        ListIterator<Object> listIterator1 = linkedList.listIterator(linkedList.size());
        while (listIterator1.hasPrevious()) {
            System.out.print(listIterator1.previous() + " ");
        }
        System.out.println();
    }
}
