package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0008_StringtoInteger {

    public static int myAtoi(String str) {
        String t = str.trim();
        if (t.length() == 0) {
            return 0;
        }
        boolean signed = false;
        char c = ' ';
        if (t.charAt(0) == '+' || t.charAt(0) == '-') {
            signed = true;
            c = t.charAt(0);
        }
        int start = signed ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < t.length(); i++) {
            if (t.charAt(i) < 48 || t.charAt(i) > 57) {
                break;
            } else {
                sb.append(t.charAt(i));
            }
        }

        if (sb.length() == 0) {
            return 0;
        }

        int ans = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (c == '-') {
                if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE  / 10&& (sb.charAt(i) - 48) > 8) {
                    return Integer.MIN_VALUE;
                }
            } else {
                if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE / 10 && (sb.charAt(i) - 48) > 7) {
                    return Integer.MAX_VALUE;
                }
            }
            ans = ans * 10 + (sb.charAt(i) - 48);
        }
        if (c == '-') {
            ans = ans * -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("2147483648"));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
