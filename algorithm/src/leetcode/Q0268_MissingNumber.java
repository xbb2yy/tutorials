package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0268_MissingNumber {
    public int missingNumber(int[] nums) {

        /**
         Set<Integer> set = new HashSet<>();
         for (int num : nums) {
         set.add(num);
         }

         for (int i = 0; i < nums.length; i++) {
         if (!set.contains(i)) {
         return i;
         }
         }
         return nums.length;
         */
        int n = nums.length;
        int sum = n * (n + 1) / 2;

        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a += nums[i];
        }
        return sum - a;
    }
}
