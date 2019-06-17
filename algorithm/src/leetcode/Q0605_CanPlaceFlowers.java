package leetcode;

public class Q0605_CanPlaceFlowers {


    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int m = 0;
        for (int i = 0; i < flowerbed.length ;) {

            if (flowerbed[i] == 1) {
                i += 2;
            }
            if (flowerbed[i] == 0 &&  flowerbed[i - 1] == 0  && flowerbed[i + 1] == 0 ) {
                m++;
                i += 2;
            }
        }

        return false;

    }
}
