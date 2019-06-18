package leetcode;

import leetcode.common.Pass;

import java.util.HashSet;

@Pass
public class Q0217_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
       /**
        *  for (int i = 0; i < nums.length ; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;*/

        HashSet<Integer> ints = new HashSet<>();

        for (int i = 0; i < nums.length ; i++) {
            if (!ints.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
