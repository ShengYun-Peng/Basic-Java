package chap23;

import java.util.ArrayList;
import java.util.Arrays;

public class Heap<E extends Comparable<E>> {
    private ArrayList<E> list;

    public Heap() {
        list = new ArrayList<>();
    }

    public Heap(E[] objects) {
        this();
        for (int i = 0; i < objects.length; ++i) {
            add(objects[i]);
        }

    }

    public void add(E object) {
        // add to the end
        list.add(object);
        int i = list.size() - 1;
        while (i > 0) {
            E tmp = list.get((i - 1) / 2);
            if (object.compareTo(tmp) > 0) {
                list.set((i - 1) / 2, object);
                list.set(i, tmp);
            } else
                break;
            i = (i - 1) / 2;
        }
    }

    // remove the root of the heap
    public E remove() {
        E returnValue = list.get(0);

        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while (currentIndex < list.size()) {
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            int maxIndex = leftChildIndex;

            if (leftChildIndex >= list.size()) break;
            if (rightChildIndex < list.size()) {
                if (list.get(leftChildIndex).compareTo(list.get(rightChildIndex)) < 0)
                    maxIndex = rightChildIndex;
            }

            if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
                E tmp = list.get(currentIndex);
                list.set(currentIndex, list.get(maxIndex));
                list.set(maxIndex, tmp);
            } else
                break;

            currentIndex = maxIndex;
        }

        return returnValue;

    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        Integer[] array = {62, 42, 59, 32, 39, 44, 13, 22, 29, 14, 33, 30, 17, 9};
        Heap<Integer> heap = new Heap<>(array);
        System.out.println(heap);

        System.out.println(heap.remove());
        System.out.println(heap);

        System.out.println(heap.remove());
        System.out.println(heap);
    }
}
