package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0151_ReverseWordsinaString {
    public static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i--) {
            if (s1[i].equals("")) {
                continue;
            }
            sb.append(s1[i] + " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String a = "a good   example";
        reverseWords(a);
    }
}
