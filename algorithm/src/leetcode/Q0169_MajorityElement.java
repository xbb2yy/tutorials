package leetcode;

import leetcode.common.Pass;

import java.util.HashMap;
import java.util.Map;

@Pass
public class Q0169_MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int thresh = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            map.compute(nums[i], (key, old) -> old == null ? 1 : old + 1);
        }
        return map.entrySet().stream().filter(e -> e.getValue() > thresh).findFirst().get().getKey();
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 3};
        majorityElement(a);
    }
}
