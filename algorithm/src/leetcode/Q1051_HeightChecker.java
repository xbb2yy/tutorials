package leetcode;

import leetcode.common.Pass;

import java.util.Arrays;

@Pass
public class Q1051_HeightChecker {
    public int heightChecker(int[] heights) {

        int[] stus = new int[heights.length];
        System.arraycopy(heights, 0, stus, 0, heights.length);

        Arrays.sort(heights);

        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != stus[i]) sum++;
        }

        return sum;
    }
}
