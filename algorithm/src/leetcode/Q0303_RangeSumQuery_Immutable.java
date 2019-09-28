package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q0303_RangeSumQuery_Immutable {

    private int[] a;
    Map<String, Integer> map = new HashMap<>();

    public Q0303_RangeSumQuery_Immutable(int[] nums) {
        a = new int[nums.length];
        System.arraycopy(nums, 0, a, 0, nums.length);
    }

    public int sumRange(int i, int j) {

        int sum = 0;
        if (map.containsKey(i + ":" + j)) {
            return map.get(i + ":" + j);
        }
        for (int k = i; k <= j; k++) {
            sum += a[k];
        }
        map.put(i + ":" + j, sum);
        return sum;
    }
}
