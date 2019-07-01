package leetcode;

public class Q0287_FindtheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int exp = (n - 1) * n / 2;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum - exp;
    }
}
