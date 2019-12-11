package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q0322_CoinChange {

    List<Integer> list = new ArrayList<>();

    public int coinChange(int[] coins, int amount) {
        coinChange(coins, amount, 0);
        return list.stream().min(Integer::compareTo).get();
    }

    public void coinChange(int[] coins, int amout, int times) {
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == amout) {
                list.add(++times);
            } else {
                if (coins[i] < amout) {
                    coinChange(coins, amout - coins[i], ++times);
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
