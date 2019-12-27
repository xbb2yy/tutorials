package leetcode;

public class Q0374_GuessNumberHigherorLower {

    public int guessNumber(int n) {
        int lo = 1, hi = n;
        int ans = lo + (hi - lo) / 2;
        while (guess(ans) != 0) {
            if (guess(ans) > 0) {
                lo = ans + 1;
            } else {
                hi = ans - 1;
            }
            ans = lo + (hi - lo) / 2;
            System.out.println(ans);
        }
        return ans;
    }

    public int guess(int n) {
        return 1;
    }
}
