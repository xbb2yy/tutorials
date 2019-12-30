package leetcode;

import leetcode.common.Pass;

import java.util.Stack;
@Pass
public class Q0032_LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();
            int l = 0;
            for (int j = i; j < s.length(); j++) {
                if (stack.isEmpty() && s.charAt(j) == ')') {
                    break;
                } else {
                    if (s.charAt(j) == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(j));
                    }
                    l++;
                    if (stack.isEmpty()) {
                        max = l > max ? l : max;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        longestValidParentheses(")()())()()(");
    }
}
