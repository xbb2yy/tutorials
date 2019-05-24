package JavaConcurrencyInPractice.c10;

import java.util.Random;

public class DemonstrateDeadLock {

    private static final int NUM_THREADS = 20;
    private static final int NUM_ACCOUNTS = 5;
    private static final int NUM_ITERATIONS = 100000;

    public static void main(String[] args) {
        final Random rd = new Random();
        final Account[] accounts = new Account[NUM_ACCOUNTS];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
        }

        class TransferThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < NUM_ITERATIONS ; i++) {
                    int from = rd.nextInt(accounts.length);
                    int to = rd.nextInt(accounts.length);
                }
            }
        }

    }
}
