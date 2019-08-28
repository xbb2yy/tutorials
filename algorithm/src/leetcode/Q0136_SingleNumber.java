package leetcode;

import java.util.HashSet;

public class Q0136_SingleNumber {

    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a ^= nums[i];
        }
        return a;
    }

}
