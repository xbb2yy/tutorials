package leetcode;

import leetcode.common.Pass;

import java.util.*;

@Pass
public class Q0018_4Sum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int N = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Set<String> s = new HashSet<>();
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int l = - 1;
                    if (k + 1 < N) {
                        /**
                         * 换成二分查找速度提高六倍
                         */
                        l = Arrays.binarySearch(nums, k + 1, N, target - nums[i] - nums[j] - nums[k]);
                    }
                    if (l >= 0) {
                        StringBuilder builder = new StringBuilder();
                        String s1 = builder.append(nums[i]).append(nums[j]).append(nums[k]).append(nums[l]).toString();
                        if (s.contains(s1))
                            continue;
                        List<Integer> m = new ArrayList<>();
                        m.add(nums[i]);
                        m.add(nums[j]);
                        m.add(nums[k]);
                        m.add(nums[l]);
                        list.add(m);
                        s.add(s1);

                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
       int[] a = {-3,-2,-1,0,0,1,2,3};
        fourSum(a, 0);
    }
}
