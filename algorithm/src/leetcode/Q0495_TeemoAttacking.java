package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0495_TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int N = timeSeries.length;
        if (N == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (timeSeries[i] - timeSeries[i - 1] > duration) {
                sum += duration;
            } else {
                sum += (timeSeries[i] - timeSeries[i - 1]);
            }
        }
        return (sum += duration);
    }
}
