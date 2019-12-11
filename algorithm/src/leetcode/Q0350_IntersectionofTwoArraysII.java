package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Pass
public class Q0350_IntersectionofTwoArraysII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> l1 = new HashMap<>();
        Map<Integer, Integer> l2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            l1.compute(nums1[i], (k, o) -> o == null ? 1 : o + 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            l2.compute(nums2[i], (k, o) -> o == null ? 1 : o + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e1 : l1.entrySet()) {
            if (l2.containsKey(e1.getKey())) {
                int min = Math.min(e1.getValue(), l2.get(e1.getKey()));
                for (int i = 0; i < min; i++) {
                    list.add(e1.getKey());
                }
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {-2147483648, 1, 2, 3};
        int[] b = {1, -2147483648, -2147483648};
        intersect(a, b);

    }
}
