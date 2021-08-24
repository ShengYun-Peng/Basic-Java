package chap24;

import java.util.LinkedList;

public class GenericQueue<E> {
    // linked list for queue, and array list for stack
    private LinkedList<E> list = new LinkedList<>();

    public void enqueue(E e) {
        list.add(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public String toString() {
        return "Queue: " + list;
    }
}
