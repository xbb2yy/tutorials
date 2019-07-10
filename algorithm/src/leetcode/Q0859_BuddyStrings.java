package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0859_BuddyStrings {

    public static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        char[] as = A.toCharArray();
        char[] bs = B.toCharArray();

        int k = 0;
        int[] a = new int[2];
        boolean containTwo = false;
        for (int i = 0; i < as.length; i++) {
            if (as[i] != bs[i]) {
                if (k >= 2) {
                    return false;
                }
                a[k] = i;
                k ++;
            }
            if (A.indexOf(as[i] + "", i + 1) != -1) {
                containTwo = true;
            }
        }

        if (k == 1) {
            return false;
        }
        if (k == 0 && containTwo) {
            return true;
        }
        if (k == 0 && !containTwo) {
            return false;
        }
        if (A.charAt(a[0]) == B.charAt(a[1]) && B.charAt(a[0]) == A.charAt(a[1])) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        buddyStrings("ab", "ca");
    }
}
