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

    public List<List<Integer>> four(int[] nums, int target) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if (nums[i] + nums[n - 1] + nums[n - 2] + nums[n - 3] < target) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j - i > 1 && nums[j] == nums[j - 1]) continue;
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if (nums[i] + nums[j] + nums[n - 1] + nums[n - 2] < target) continue;

                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int tmp = nums[i] + nums[j] + nums[left] + nums[right];
                    if (tmp == target) {
                        List<Integer> tmpList = new LinkedList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        res.add(tmpList);
                        while (left < right && nums[left] == nums[left + 1]) left += 1;
                        while (left < right && nums[right] == nums[right - 1]) right -= 1;
                        left += 1;
                        right -= 1;
                    } else if (tmp > target) right -= 1;
                    else left += 1;
                }
            }

        }

        return res;
    }

    public static void main(String[] args) {
       int[] a = {-3,-2,-1,0,0,1,2,3};
        fourSum(a, 0);
    }
}
