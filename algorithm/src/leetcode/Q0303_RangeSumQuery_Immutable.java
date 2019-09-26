package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q0303_RangeSumQuery_Immutable {

    private List<Integer> list = new ArrayList<>();
    public Q0303_RangeSumQuery_Immutable(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
    }

    public int sumRange(int i, int j) {

        int sum = 0;
        for (int k = i; k <= j ; k++) {
            sum += list.get(k);
        }
        return sum;
    }
}
