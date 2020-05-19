package leetcode;

public class Q0680_ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) == s.charAt(high)) {
                low++;
                high--;
            } else {
                boolean f1 = true, f2 = true;
                for (int i = low + 1, j = high; i < j; i++, j--) {
                    if (s.charAt(i) != s.charAt(j)) {
                        f1 = false;
                        break;
                    }
                }
                for (int i = low, j = high - 1; i < j; i++, j--) {
                    if (s.charAt(i) != s.charAt(j)) {
                        f2 = false;
                        break;
                    }
                }
                return f1 || f2;
            }
        }
        return true;
    }
}
