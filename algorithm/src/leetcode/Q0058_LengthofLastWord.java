package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0058_LengthofLastWord {

    public static int lengthOfLastWord(String s) {

        /**
         *  Runtime: 1 ms, faster than 46.09% of Java online submissions for Length of Last Word.
         *         String[] s1 = s.split(" ");
         *         if (s1.length == 0) {
         *             return 0;
         *         }
         *         return s1[s1.length -1].length();
         */

        /**
         * Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
         */
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(s.length() - i - 1);
            if (c != ' ') {
                builder.append(c);
            } else if (builder.length() == 0) {
                continue;
            } else {
                break;
            }

        }
        return builder.toString().length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
    }
}
