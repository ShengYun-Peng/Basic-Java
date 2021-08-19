package chap19;

import java.util.ArrayList;

public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public GenericStack() { }

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public E pop() {
        E value = peek();
        list.remove(getSize() - 1);
        return value;
    }

    public void push(E value) {
        list.add(value);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack " + list;
    }

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");

        System.out.println(stack1.pop());
        System.out.println(stack1);
    }
}
