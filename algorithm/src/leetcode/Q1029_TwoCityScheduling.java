package leetcode;

public class Q1029_TwoCityScheduling {

    public static int twoCitySchedCost(int[][] costs) {

        int sum = 0;

        for (int i = 0; i < costs.length ; i++) {
            int[] cost = costs[i];
            int min = cost[0];
            for (int j = 0; j < cost.length ; j++) {
                if (cost[j] < min) {
                    min = cost[j];
                }
            }
            sum += min;
        }

        return sum;

    }

    public static void main(String[] args) {
        int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
        System.out.println(twoCitySchedCost(costs));
    }
}
