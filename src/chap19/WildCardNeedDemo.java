package chap19;

public class WildCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(-2);

        System.out.println(max(stack));
    }

    public static double max(GenericStack<? extends Number> stack) {
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty()) {
            double tmp = stack.pop().doubleValue();
            if (tmp > max)
                max = tmp;
        }

        return max;
    }
}
