package chap20;

import java.util.Arrays;
import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("WRONG args number");
            System.exit(1);
        }

        try {
            System.out.print(args[0] + " = ");
            System.out.println(evaluateExpression(args[0]));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Wrong expression: " + args[0]);
        }
    }

    public static int evaluateExpression(String expression) {
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        expression = insertBlanks(expression);
        String[] tokens = expression.split(" ");

        for (String s : tokens) {
            if (s.length() == 0) {
                continue;
            } else if (s.charAt(0) == '+' || s.charAt(0) == '-') {
                // if the operator is +/-, check the top of the stack and process original operator first
                while (!operator.isEmpty() &&
                        (operator.peek() == '+' || operator.peek() == '-' ||
                         operator.peek() == '*' || operator.peek() == '/'))
                    processAnOperator(operand, operator);
                operator.push(s.charAt(0));
            } else if (s.charAt(0) == '*' || s.charAt(0) == '/') {
                while (!operator.isEmpty() &&
                        (operator.peek() == '*' || operator.peek() == '/'))
                    processAnOperator(operand, operator);
                operator.push(s.charAt(0));
            } else if (s.trim().charAt(0) == '(') {
                operator.push(s.charAt(0));
            } else if (s.trim().charAt(0) == ')') {
                while (operator.peek() != '(') {
                    processAnOperator(operand, operator);
                }
                operator.pop();
            } else {
                operand.push(Integer.parseInt(s.trim()));
            }
        }

        // phase 2: process all the remaining operators
        while (!operator.isEmpty())
            processAnOperator(operand, operator);

        return operand.pop();
    }

    public static void processAnOperator(Stack<Integer> operand, Stack<Character> operator) {
        int op1 = operand.pop();
        int op2 = operand.pop();
        char op = operator.pop();

        if (op == '+')
            operand.push(op1 + op2);
        else if (op == '-')
            operand.push(op1 - op2);
        else if (op == '*')
            operand.push(op1 * op2);
        else if (op == '/')
            operand.push(op1 / op2);
    }

    public static String insertBlanks(String s) {
        String result = "";
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' ||
            s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/')
                result += " " + s.charAt(i) + " ";
            else
                result += s.charAt(i);
        }

        return result;
    }

}
