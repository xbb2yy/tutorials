package algorithm;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/24 9:53
 */
public class 二分查找 {


    public static void main(String[] args) {
        int[] array = {1, 2, 6, 7, 8, 9};
        int i = binarySearch(array, 7);
        System.out.println(i);

        System.out.println(recursionBinarySearch(array, 7, 0, 5));
    }


    public static int binarySearch(int[] array, int key) {

        int lo = 0;
        int hi = array.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] > key) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public static int recursionBinarySearch(int[] array, int key, int l, int h) {

        if (key > array[h] || key < array[l] || l > h) {
            return -1;
        }

        int mid = l + (h - l) / 2;
        if (array[mid] == key) {
            return mid;
        } else if (array[mid] > key) {
            h = mid - 1;
            return recursionBinarySearch(array, key, l, h);
        } else {
            l = mid + 1;
            return recursionBinarySearch(array, key, l, h);
        }
    }
}