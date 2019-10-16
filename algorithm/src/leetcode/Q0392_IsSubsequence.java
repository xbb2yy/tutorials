package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0392_IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int k = 0;
        for (int i = 0; i < sArray.length; i++) {
            boolean find = false;
            for (int j = k; j < tArray.length; j++) {
                if (sArray[i] == tArray[j]) {
                    find = true;
                    k = j + 1;
                    break;
                }
            }
            if (!find) {
                return false;
            }
        }
        return true;
    }
}
