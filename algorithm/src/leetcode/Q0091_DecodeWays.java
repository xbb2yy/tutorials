package leetcode;

public class Q0091_DecodeWays {

    public static int numDecodings(String s) {

        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if ((s.charAt(i - 1) - 48) * 10 + s.charAt(i) - 48 > 26) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }
        return dp[s.length() - 1];
    }

    public static void main(String[] args) {
        numDecodings("12");
    }
}
