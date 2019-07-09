package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0121_BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {

        /*
        Runtime: 204 ms, faster than 5.46% of Java online submissions for Best Time to Buy and Sell Stock.
        Memory Usage: 37.9 MB, less than 98.47% of Java online submissions for Best Time to Buy and Sell Stock.
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length ; j++) {
                if (prices[j] - prices[i] > max) {
                    max = prices[j] - prices[i];
                }
            }
        }

        return max;*/
        if (prices.length <= 1) {
            return 0;
        }
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length ; i++) {

            if (min >= prices[i]) {
                min = prices[i];
            } else{
                int diff = prices[i] - min;
                if (diff > max) {
                    max = diff;
                }
            }
        }
        return max;
    }
}
