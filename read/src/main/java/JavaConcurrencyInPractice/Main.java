package JavaConcurrencyInPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    private static ThreadLocal<Integer> local = new ThreadLocal<>();

    public static void main(String[] args) throws Exception {
        local.set(2);
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 4; i++) {
            service.execute(() -> {
                local.set(3);
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(local.get());
            });
        }
        System.out.println(local.get());
        service.shutdownNow();
    }
}
