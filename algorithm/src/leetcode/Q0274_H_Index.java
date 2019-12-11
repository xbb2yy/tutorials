package leetcode;

public class Q0274_H_Index {

    public static int hIndex(int[] citations) {

        int N = citations.length;
        if (N == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (citations[j] >= citations[i]) {
                    count++;
                }
            }
            if (count <= citations[i]) {
                max = count > max ? count : max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {3, 0, 6, 1, 5};
        hIndex(a);
    }
}
