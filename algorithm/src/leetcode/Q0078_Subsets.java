package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q0078_Subsets {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> r =  new ArrayList<>();

        if (nums == null )
            return null;
        if (nums.length == 0){
            return r;
        }
        add(r, new ArrayList<>(), 0, nums);
        return r;
    }

    public static void add(List<List<Integer>> r, List<Integer> t, int i, int[] a) {
        r.add(new ArrayList<>(t));
        for (int j = i; j < a.length ; j++) {

        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        subsets(a);
    }
}
