package leetcode;

import leetcode.common.Pass;

import java.util.HashSet;
import java.util.Set;

@Pass
public class Q0268_MissingNumbe {
    public int missingNumber(int[] nums) {

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
    }
}
