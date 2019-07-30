package algorithm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private final static Lock lock = new ReentrantLock();

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {

        System.out.printf("%-5.2s%d", "hgfhgfghfh", 13324);

    }
}
