package leetcode;

import java.util.LinkedList;

public class Q0071_SimplifyPath {

    public static String simplifyPath(String path) {
        String[] s = path.split("/");
        LinkedList<String> stack = new LinkedList<>();
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                if (!s[i] .equals(".") && !s[i].isEmpty()) {
                    stack.push(s[i]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.removeLast());
        }

        return sb.toString().isEmpty() ? "/" : sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(simplifyPath("/home//foo"));
    }
}
