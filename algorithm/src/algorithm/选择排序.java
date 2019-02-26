package algorithm;

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
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp;
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
        return a;
    }
    
}
