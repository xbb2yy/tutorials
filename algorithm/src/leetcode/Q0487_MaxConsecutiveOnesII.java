package leetcode;

/**
 * 给定一个二进制数组，你可以最多将 1 个 0 翻转为 1，找出其中最大连续 1 的个数。
 * 示例 1：
 * 输入：[1,0,1,1,0]
 * 输出：4
 */
public class Q0487_MaxConsecutiveOnesII {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {

            }
        }
        return -1;
    }

}
