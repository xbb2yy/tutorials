package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0011_ContainerWithMostWater {

    public int maxArea(int[] height) {

        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
               max = Math.max(max,  Math.min(height[i], height[j]) * (j - i));
            }
        }
        return max;
    }

    public int solution(int[] height) {

        int i = 0, j = height.length - 1, max = 0;

        while (i < j) {
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            int t = (height[i] <= height[j]) ? i++ : j--;
        }
        return max;
    }


}
