package algorithm;

import edu.princeton.cs.algs4.StdRandom;

public class Main {

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        System.out.println(gcd(3, 5));
        System.out.println(5.0 / 3);

        StdRandom.uniform(2);
        StdRandom.bernoulli(2);
    }
}
