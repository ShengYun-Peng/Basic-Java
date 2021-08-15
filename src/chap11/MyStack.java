package chap11;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getSize() {
        return stack.size();
    }

    public Object peek() {
        if (getSize() == 0)
            return null;
        return stack.get(stack.size() - 1);
    }

    public Object pop() {
        if (getSize() == 0)
            return null;
        Object value = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return value;
    }

    public void push(Object object) {
        stack.add(object);
    }

    public String toString() {
        return "Stack: " + stack;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        for (int i = 0; i < 20; ++i) {
            stack.push(i);
        }

        System.out.println(stack);
    }
}
