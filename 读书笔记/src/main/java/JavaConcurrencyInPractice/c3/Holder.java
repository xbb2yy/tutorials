package JavaConcurrencyInPractice.c3;

import java.util.Random;

public class Holder {

    private int n;

    public Holder(int n) {
        this.n = n;
    }

    public void assertSanity() {
        if (n != n) {
            throw new RuntimeException("not equals");
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        while (true) {
            Holder holder = new Holder(r.nextInt(1000));
            new Thread(() -> holder.assertSanity()).start();
        }
    }
}
