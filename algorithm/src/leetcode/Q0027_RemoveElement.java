package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0027_RemoveElement {
    public static int removeElement(int[] nums, int val) {

        int N = nums.length;
        int l = 0, s = 1;

        boolean end = false;
        for (int i = 0; i < N; i++) {
            if (nums[i] == val) {
                for (int j = s; j < N; j++) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        l++;
                        if (s == N - 1) {
                            end = true;
                        }
                        s++;
                        break;
                    }
                }
            } else {
                l++;
                s++;
            }
            if (end) {
                return l;
            }

        }
        return l;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        removeElement(a, 2);
    }
}
