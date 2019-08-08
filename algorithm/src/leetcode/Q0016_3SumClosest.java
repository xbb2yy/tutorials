package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q0016_3SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        list.sort(Integer::compareTo);
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (Integer i : list) {
            if (Math.abs(i - target) <= min) {
                min = Math.abs(i - target);
                result = i;
            }

        }
        return result;
    }
}
