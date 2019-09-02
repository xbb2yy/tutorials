package leetcode;

import java.util.LinkedList;

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

    public static int solution(int[] calories, int k, int lower, int upper) {

        LinkedList<Integer> list = new LinkedList<>();

        int result = 0;
        int tmp = 0;
        for (int i = 0; i < calories.length; i++) {
            list.addLast(calories[i]);
            tmp += calories[i];
            if (list.size() == k) {
                if (tmp < lower) {
                    result -= 1;
                }
                if (tmp > upper) {
                    result += 1;
                }
                tmp -= list.removeFirst();
            }
        }
        return result;
    }

    public static int solution3(int[] calories, int k, int lower, int upper) {

        int start = 0, end = 0, result = 0, tmp = 0;
        for (int i = 0; i < calories.length; i++) {
            end++;
            tmp += calories[i];
            if (end - start == k) {
                if (tmp > upper) {
                    result += 1;
                }
                if (tmp < lower) {
                    result -= 1;
                }
                tmp -= calories[start];
                start++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {6, 5, 0, 0};
        solution3(a, 2, 1, 5);
    }
}
