package leetcode;

public class Q1176_DietPlanPerformance {

    public static int dietPlanPerformance(int[] calories, int k, int lower, int upper) {

        int result = 0;
        int count = 1;
        int tmp = 0;

        for (int i = 0; i < calories.length; i++) {
            if (count <= k) {
                tmp += calories[i];
                if (count == k) {
                    if (tmp < lower) {
                        result -=1;
                    }
                    if (tmp > upper) {
                        result += 1;
                    }
                    tmp = 0;
                    count = 1;
                    i = i - k + 1;
                } else {
                    count++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {3, 2};
        dietPlanPerformance(a, 2, 0, 1);
    }
}
