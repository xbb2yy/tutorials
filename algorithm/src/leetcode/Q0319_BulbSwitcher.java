package leetcode;

import java.util.Arrays;

public class Q0319_BulbSwitcher {

    public static int bulbSwitch(int n) {
        boolean[] bulbs = new boolean[n];
        for (int i = 1; i <= n; i++) {
            int step = 0;
            for (int j = 0; j < n; j++) {
                step++;
                if (step == n) {
                    bulbs[j] = !bulbs[j];
                    step = 0;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (bulbs[i]) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        bulbSwitch(2);
    }
}
