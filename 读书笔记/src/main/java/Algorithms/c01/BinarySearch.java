package Algorithms.c01;

/**
 * @description 二分查找
 */
public class BinarySearch {

    /**
     *
     * @param a 升序排序的数组
     * @param key 查找的值
     * @return
     */
    public static int binarySearch(int[] a, int key) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key == a[mid]) return mid;
            if (key < a[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return  - 1;
    }


    public static void main(String[] args) {
        int[] a = {21, 23, 45, 78, 96};
        System.out.println(binarySearch(a, 45));
        System.out.println(binarySearch(a, 21));
        System.out.println(binarySearch(a, 23));
        System.out.println(binarySearch(a, 78));
        System.out.println(binarySearch(a, 5));
    }
}
