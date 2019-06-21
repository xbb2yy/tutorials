package leetcode;

public class Q0204_CountPrimes {

    public static int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        }
        int count = 1;
        for (int i = 3; i < n; i= i + 2){

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == (i - 1)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(countPrimes(499979));
    }
}
