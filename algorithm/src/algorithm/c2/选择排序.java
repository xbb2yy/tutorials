package algorithm.c2;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 15:07
 */
public class 选择排序 {

    public static void main(String[] args) {
        int[] a = {32, 78, 22, 34, 43, 2, 66, 23, 77, 55};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    // 选择排序
    public static int[] sort(int[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[j] < a[i]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }
    
}
