package leetcode;

import leetcode.common.Pass;

@Pass
public class Q1010_PairsofSongsWithTotalDurationsDivisibleby60 {

    /**
     * 暴力解法 O(N^2)
     * @param time
     * @return
     */
    public int numPairsDivisibleBy60(int[] time) {

        int sum = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                if ((time[i] + time[j]) % 60 == 0) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public int solution(int[] time) {

        int sum = 0;
        int[] a = new int[60];
        for (int i = 0; i < time.length; i++) {
            a[time[i] % 60]++;
        }
        for (int i = 1;  i < 30; i++) {
            sum += a[i] * a[60 - i];
        }
        sum = sum + a[0] * (a[0] - 1) / 2 + a[30] * (a[30] - 1) / 2;
        return sum;
    }
}
