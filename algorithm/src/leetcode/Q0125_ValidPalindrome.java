package leetcode;

public class Q0125_ValidPalindrome {
    public static boolean isPalindrome(String s) {

        String a = s.toLowerCase();
        int i = 0, j = a.length() - 1;
        for(; i < j;) {
            if (a.charAt(i) < '0' || a.charAt(i) > 'z' || ('9' < a.charAt(i) && a.charAt(i) < 'a')) {
                i++;
                continue;
            }
            if (a.charAt(j) < '0' || a.charAt(j) > 'z' || ('9' < a.charAt(j) && a.charAt(j) < 'a')) {
                j--;
                continue;
            }
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome("0P");
    }
}
