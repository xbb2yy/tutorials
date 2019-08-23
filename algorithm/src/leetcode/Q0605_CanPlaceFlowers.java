package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0605_CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        boolean prev = false;
        int sum = 0;
        for (int i = 0; i < flowerbed.length;) {
            if (prev) {
                prev = flowerbed[i] == 1;
                i++;
            } else {
                if (flowerbed[i] == 0 && ((i + 1 < flowerbed.length && flowerbed[i + 1] == 0) || i == flowerbed.length - 1) ) {
                    sum++;
                    prev = false;
                    i += 2;
                } else {
                    prev = flowerbed[i] == 1;
                    i++;
                }

            }
        }
        return n <= sum;
    }

    public static void main(String[] args) {
        int[] a = {1,0,0,0,1,0,0};
        canPlaceFlowers(a, 2);
    }
}
