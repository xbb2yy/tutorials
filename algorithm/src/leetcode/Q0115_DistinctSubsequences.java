package leetcode;

public class Q0115_DistinctSubsequences {

    private int count = 0;
    public int numDistinct(String s, String t) {

        if (t.length() == 0) return count;
        if (t.length() == 1) {
            for (int i = 0; i < s.length(); i++) {
                if (t.charAt(0) == s.charAt(i))
                    count++;
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (t.charAt(0) == s.charAt(i)) {
                    numDistinct(s.substring(i + 1), t.substring(1));
                }
            }
        }

        return count;
    }
}
