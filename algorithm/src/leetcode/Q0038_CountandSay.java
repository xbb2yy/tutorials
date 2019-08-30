package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0038_CountandSay {

    /**
     * 1.     1
     * 2.     11
     * 3.     21
     * 4.     1211
     * 5.     111221
     * @param n
     * @return
     */
    public static String countAndSay(int n) {

        StringBuilder s = new StringBuilder("1");
        for (int i = 1; i < n; i++) {
            StringBuilder b = new StringBuilder();
            String s1 = s.toString();
            char[] chars = s1.toCharArray();
            for (int j = 0; j < s.length();) {
                int k = 1;
                while (j + k < s.length() && chars[j + k] == chars[j]) {
                    k++;
                }
                b.append(k);
                b.append(chars[j]);
                j += k;

            }
            s = b;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(440));
    }

}
