package leetcode;

public class Q0344_ReverseString {

    public void reverseString(char[] s) {

        if (s.length == 0) {
            return;
        }

        int i = 0, j = s.length - 1;

        while (j < s.length && i < j) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }
    }
}
