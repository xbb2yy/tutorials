package leetcode;

public class Q0303_RangeSumQuery_Immutable {

    private int[] a;

    public Q0303_RangeSumQuery_Immutable(int[] nums) {
        a = new int[nums.length];
        System.arraycopy(nums, 0, a, 0, nums.length);
    }

    public int sumRange(int i, int j) {

        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += a[k];
        }
        return sum;
    }
}
