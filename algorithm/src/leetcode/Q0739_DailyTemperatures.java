package leetcode;

public class Q0739_DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            int tmp = 0;
            for (int j = i + 1; j < T.length; j++) {
                tmp++;
                if (T[j] > T[i]) {
                    ans[i] = tmp;
                }

            }
        }
        return ans;
    }
}
