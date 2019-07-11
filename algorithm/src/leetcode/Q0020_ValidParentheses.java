package leetcode;

import leetcode.common.Pass;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

@Pass
public class Q0020_ValidParentheses {
    public static boolean isValid(String s) {

      /*  if (s .equals("") ) {
            return true;
        }

        Map<Character, Integer> map = new HashMap<>();
        map.put('(', -1);
        map.put('[', -2);
        map.put('{', -3);
        map.put(')', 1);
        map.put(']', 2);
        map.put('}', 3);

        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (stack.empty()) {
                stack.push(map.get(chars[i]));
            } else {
                if (map.get(c) > 0 && stack.peek() + map.get(c) != 0) {
                    return false;
                } else if (map.get(c) > 0 && stack.peek() + map.get(c) == 0) {
                    stack.pop();
                } else {
                    stack.push(map.get(c));
                }
            }
        }

        return stack.empty();*/

      Map<Character, Character> map = new HashMap<>();
      map.put('(', ')');
      map.put('[', ']');
      map.put('{', '}');

      Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            } else {
                if (stack.empty() || map.get(stack.peek()) != chars[i]) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        isValid("()");
    }
}
