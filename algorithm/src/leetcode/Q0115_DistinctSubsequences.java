package leetcode;

public class Q0115_DistinctSubsequences {

    private int count = 0;
    public int numDistinct(String s, String t) {

        if (t.length() == 0) count++;
        for (int i = 0; i < s.length(); i++) {
            if (t.length() == 0) {
                break;
            }
            if (t.charAt(0) == s.charAt(i)) {
                if (s.substring(i + 1).length() < t.substring(1).length()) continue;
                numDistinct(s.substring(i + 1), t.substring(1));
            }
        }
        return count;
    }
}
