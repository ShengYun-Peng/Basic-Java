package chap24;

import chap23.Heap;

public class MyPriorityQueue<E extends Comparable<E>> {
    Heap<E> heap = new Heap<E>();

    public void enqueue(E element) {
        heap.add(element);
    }

    public E dequeue() {
        return heap.remove();
    }

    public int getSize() {
        return heap.getSize();
    }
}
