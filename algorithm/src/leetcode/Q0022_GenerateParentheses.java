package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.List;
@Pass
public class Q0022_GenerateParentheses {

    private static List<String> list = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        generate("(", n - 1, n);
        return list;
    }

    public static void generate(String prev, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(prev);
        }
        if (right == left) {
            generate(prev + "(", left - 1, right);
        } else {
            if (left >= 1) {
                generate(prev + "(", left - 1, right);
            }
            if (right >= 1) {
                generate(prev + ")", left , right - 1);
            }
        }
    }

    public static void main(String[] args) {
        generateParenthesis(3);
    }
}
