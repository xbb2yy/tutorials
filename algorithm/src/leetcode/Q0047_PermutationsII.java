package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Pass
public class Q0047_PermutationsII {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        List<Integer> n = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            n.add(nums[i]);
        }
        permute(l, n, integers);
        return l;
    }

    public static void permute(List<List<Integer>> list, List<Integer> nums, List<Integer> l) {
        if (nums.size() == 0) {
            list.add(l);
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            ArrayList<Integer> integers = new ArrayList<>(l);
            if (i > 0 && nums.get(i) == nums.get(i - 1)) {
                continue;
            }
            integers.add(nums.get(i));
            ArrayList<Integer> arrayList = new ArrayList<>(nums);
            arrayList.remove(i);
            permute(list, arrayList, integers);
        }

    }
}
