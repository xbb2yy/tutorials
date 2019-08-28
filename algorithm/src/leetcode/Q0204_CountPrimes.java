package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0204_CountPrimes {

    public static int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        }
        int count = 1;
        for (int i = 3; i < n; i = i + 2){
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) count++;
        }
        return count;
    }

    public static int solution(int n) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(15));
    }
}
