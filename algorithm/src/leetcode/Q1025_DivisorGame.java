package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q1025_DivisorGame {

    public static boolean divisorGame(int N) {

        return N % 2 == 0;
/*
        Map<Integer, Boolean>
        if (N == 1) {
            return false;
        }

        for (int i = 1; i < N; i++) {
            if (N % i == 0 && !divisorGame(N - i)) {
                return true;
            }
        }
        cache.put(N, false);
        return false;*/
    }

    public static void main(String[] args) {
        System.out.println(divisorGame(1000));
    }
}
