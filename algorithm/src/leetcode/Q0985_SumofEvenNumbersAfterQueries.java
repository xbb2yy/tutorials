package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0985_SumofEvenNumbersAfterQueries {

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {

        int[] B = new int[A.length];

        for (int i = 0; i < queries.length; i++) {
            int i0 = queries[i][0];
            int i1 = queries[i][1];

            A[i1] = A[i1] + i0;

            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 0) {
                    sum += A[j];
                }
            }
            B[i] = sum;
        }

        return B;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};

        sumEvenAfterQueries(A, queries);
    }
}
