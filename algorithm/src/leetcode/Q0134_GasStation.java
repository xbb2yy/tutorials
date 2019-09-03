package leetcode;

public class Q0134_GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {


        int total = 0;
        int sum = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);
            if (sum < 0) {
                sum = gas[i] - cost[i];
                start = i;
            } else {
                sum += (gas[i] - cost[i]);
            }
        }
        return total >= 0 ? start : -1;
    }
}
