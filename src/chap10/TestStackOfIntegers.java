package chap10;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntergers stack = new StackOfIntergers();

        for (int i = 0; i < 20; ++i) {
            stack.push(i);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
