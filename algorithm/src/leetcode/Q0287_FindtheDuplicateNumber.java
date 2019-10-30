package leetcode;

public class Q0287_FindtheDuplicateNumber {

    public int findDuplicate(int[] nums) {
       int n = 0;
        for (int i = 0; i < nums.length; i++) {
            n^=nums[i];
            if (n == 0) return nums[i];
        }
        return -1;
    }
}
