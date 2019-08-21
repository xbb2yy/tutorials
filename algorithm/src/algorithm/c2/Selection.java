package algorithm.c2;

import static algorithm.c2.Example.*;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/25 15:07
 */
public class Selection {

    public static void main(String[] args) {
        Integer[] a = {32, 78, 22, 34, 43, 2, 66, 23, 77, 55};
        sort(a);
        assert isSorted(a);
        show(a);
    }

    // 选择排序 每次选择剩余元素的最小元素
    public static Comparable[] sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int m = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[m])) {
                    m = j;
                }
            }
            exch(a, i, m);
        }
        return a;
    }
    
}
