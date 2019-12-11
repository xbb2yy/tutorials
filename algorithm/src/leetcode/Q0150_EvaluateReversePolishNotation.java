package leetcode;

import java.util.Stack;

public class Q0150_EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].equals("*")) {
                String m = stack.pop();
                String n = stack.pop();
                stack.push(String.valueOf(Integer.valueOf(m) * Integer.valueOf(n)));
                continue;
            }

            if (tokens[i].equals("-")) {
                String m = stack.pop();
                String n = stack.pop();
                stack.push(String.valueOf(Integer.valueOf(m) - Integer.valueOf(n)));
                continue;
            }

            if (tokens[i].equals("/")) {
                String m = stack.pop();
                String n = stack.pop();
                stack.push(String.valueOf(Integer.valueOf(m) / Integer.valueOf(n)));
                continue;
            }

            if (tokens[i].equals("+")) {
                String m = stack.pop();
                String n = stack.pop();
                stack.push(String.valueOf(Integer.valueOf(m) + Integer.valueOf(n)));
                continue;
            }
            stack.push(tokens[i]);
        }

        return Integer.valueOf(stack.pop());
    }

    public static void main(String[] args) {
        String[] strs =  {"0", "3",  "/"};
        System.out.println(evalRPN(strs));
    }
}
