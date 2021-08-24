package chap24;

import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public class Node<E> {
        private E element;
        Node<E> next;

        public Node(E e) {
            element = e;
        }
    }

    public MyLinkedList() { }
    public MyLinkedList(E[] objects) {
        for (E e : objects)
            add(e);
    }

    public E getFirst() {
        if (head == null)
            return null;
        else
            return head.element;
    }

    public E getLast() {
        if (tail == null)
            return null;
        else
            return tail.element;
    }

    public void addFirst(E e) {
        Node<E> node = new Node<>(e);
        node.next = head;

        if (size == 0)
            head = tail = node;
        else
            head = node;

        ++size;
    }

    public void addLast(E e) {
        Node<E> node = new Node<>(e);

        if (size == 0)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        ++size;
    }

    @Override
    public void add(int index, E e) {
        if (index == 0) addFirst(e);
        else if (index >= size) addLast(e);
        else {
            Node<E> node = new Node<>(e);
            Node<E> current = head;
            for (int i = 1; i < index; ++i)
                current = current.next;

            Node<E> tmp = current.next;
            node.next = tmp;
            current.next = node;

            ++size;
        }
    }

    public E removeFirst() {
        if (size == 0) return null;
        Node<E> tmp = head;
        head = head.next;
        --size;
        if (head == null) tail = null;

        return tmp.element;
    }

    public E removeLast() {
        if (size == 0) return null;
        else if (size == 1) {
            Node<E> tmp = head;
            head = tail = null;
            --size;
            return tmp.element;
        } else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; ++i)
                current = current.next;
            Node<E> tmp = tail;
            tail = current;
            tail.next = null;
            --size;

            return tmp.element;
        }
    }

    @Override
    public E remove(int index) {
        if (index == 0) return removeFirst();
        else if (index == size - 1) return removeLast();
        else {
            Node<E> previous = head;
            for (int i = 1; i < index; ++i)
                previous = previous.next;
            Node<E> tmp = previous.next;
            previous.next = tmp.next;
            --size;

            return tmp.element;
        }
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        Node<E> node = head;
        for (int i = 0; i < index; ++i)
            node = node.next;
        return node.element;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    @Override
    public int indexOf(Object e) {
        Node<E> node = head;
        int index = 0;
        while (index < size) {
            if (node.element.equals(e))
                return index;
            ++index;
            node = node.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        Node<E> node = head;
        int index = 0;
        int lastIndex = -1;
        while (index < size) {
            if (node.element.equals(e))
                lastIndex = index;
            ++index;
            node = node.next;
        }
        return lastIndex;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public void clear() {
        size = 0;
        head = tail = null;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[");

        Node<E> node = head;
        while (node != null) {
            string.append(node.element);
            if (node.next != null)
                string.append(", ");
            node = node.next;
        }

        string.append("]");
        return string.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    class LinkedListIterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        @Override
        public void remove() {
            if (size == 0)
                throw new IllegalStateException();
            MyLinkedList.this.remove(indexOf(current.element) + 1);
        }
    }
}
