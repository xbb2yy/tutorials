package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.List;

@Pass
public class Q0078_Subsets {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> r =  new ArrayList<>();
        if (nums == null ) {
            return null;
        }
        if (nums.length == 0){
            return r;
        }
        r.add(new ArrayList<>());
        add(r, 0, nums);
        return r;
    }

    public static void add(List<List<Integer>> r,  int i, int[] a) {
        if (i > a.length - 1) return;

        List<List<Integer>> tmp =  new ArrayList<>();
        for (List<Integer> integers : r) {
            ArrayList<Integer> list = new ArrayList<>(integers);
            integers.add(a[i]);
            tmp.add(list);
        }
        r.addAll(tmp);
        add(r, i + 1 , a);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        subsets(a);
    }
}
