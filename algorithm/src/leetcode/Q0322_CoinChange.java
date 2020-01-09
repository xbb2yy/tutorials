package leetcode;

public class Q0322_CoinChange {

    static int min = Integer.MAX_VALUE;

    public static int coinChange(int[] coins, int amount) {
        change(coins, amount, 0);
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void change(int[] coins, int amount, int count) {
        if (amount < 0) return;
        if (amount == 0) {
            min = Math.min(min, count);
            return;
        }

        for (int i = 0; i < coins.length; i++) {
            change(coins, amount - coins[i], ++count);
        }
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(coinChange(coins, 11));
    }
}
