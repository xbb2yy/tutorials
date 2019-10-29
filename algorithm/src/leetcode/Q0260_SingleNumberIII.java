package leetcode;

import leetcode.common.Pass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Pass
public class Q0260_SingleNumberIII {

    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.compute(nums[i], (k, old) -> old == null ? 1 : ++old);
        }
        List<Integer> collect = map.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        ans[0] = collect.get(0);
        ans[1] = collect.get(1);
        return ans;
    }
}
