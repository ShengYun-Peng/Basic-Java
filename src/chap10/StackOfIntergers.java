package chap10;

import java.util.Arrays;

public class StackOfIntergers {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public StackOfIntergers(int capacity) {
        elements = new int[capacity];
    }

    public StackOfIntergers() {
        this(DEFAULT_CAPACITY);
    }

    public void push(int value) {
        // increase size if it is too long
        if (size >= elements.length) {
            int[] newElements = new int[2 * elements.length];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size] = value;
        ++size;
    }

    public int pop() {
        int value = elements[size - 1];
        --size;
        return value;
    }

    public int peek() {
        return elements[size - 1];
    }

    public int getSize() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }
}
