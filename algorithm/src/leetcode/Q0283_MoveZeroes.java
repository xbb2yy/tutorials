package leetcode;

public class Q0283_MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (k > nums.length) {
                break;
            }
            if (nums[i] == 0) {
                for (int j = k; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        k = j + 1;
                        break; // 第一次没加break导致出错
                    }
                }
            } else {
                k++; // 忘了
            }
        }
    }
    public static void solution(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4,2,4,0,2,3,1,5,1,0};
        moveZeroes(a);
    }
}
