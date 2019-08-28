package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.List;

@Pass
public class Q0046_Permutations {

    public static List<List<Integer>> permute(int[] nums) {
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
            integers.add(nums.get(i));
            ArrayList<Integer> arrayList = new ArrayList<>(nums);
            arrayList.remove(i);
            permute(list, arrayList, integers);
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(permute(a));
    }
}
