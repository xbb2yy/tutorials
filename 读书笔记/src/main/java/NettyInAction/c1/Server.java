package NettyInAction.c1;

import java.io.IOException;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Server {

    public static void main(String[] args) throws IOException {

        final  int i = 1;
        Timer timer = new Timer();
  /*      timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(i);
                throw new IllegalArgumentException();
            }
        }, 2000, 5000);*/

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);
        pool.scheduleAtFixedRate(() -> System.out.println(1), 2, 5, TimeUnit.SECONDS);
    }
}
