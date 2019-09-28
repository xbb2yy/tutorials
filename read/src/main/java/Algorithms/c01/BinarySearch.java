package Algorithms.c01;

/**
 * @description 二分查找
 */
public class BinarySearch {

    /**
     * @param a   升序排序的数组
     * @param key 查找的值
     * @return
     */
    public static int binarySearch(int[] a, int key) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key == a[mid])
                return mid;
            if (key < a[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return -1;
    }

    /**
     * 递归二分查找
     */
    public static int recursiveBinarySearch(int[] a, int key) {
        return recursiveBinarySearch(a, key, 0, a.length - 1);
    }

    private static int recursiveBinarySearch(int[] a, int key, int lo, int hi) {
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        if (key == a[mid])
            return mid;
        if (key < a[mid]) {
            return recursiveBinarySearch(a, key, lo, mid - 1);
        } else {
            return recursiveBinarySearch(a, key, mid + 1, hi);
        }


    }


    public static void main(String[] args) {
        int[] a = {21, 23, 45, 78, 96};
        System.out.println(binarySearch(a, 45));
        System.out.println(binarySearch(a, 21));
        System.out.println(binarySearch(a, 23));
        System.out.println(binarySearch(a, 78));
        System.out.println(binarySearch(a, 5));

        System.out.println(recursiveBinarySearch(a, 45));
        System.out.println(recursiveBinarySearch(a, 21));
        System.out.println(recursiveBinarySearch(a, 23));
        System.out.println(recursiveBinarySearch(a, 78));
        System.out.println(recursiveBinarySearch(a, 5));
    }
}
