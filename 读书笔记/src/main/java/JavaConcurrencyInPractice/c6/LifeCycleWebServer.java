package JavaConcurrencyInPractice.c6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public class LifeCycleWebServer {

    private final ExecutorService exec = Executors.newFixedThreadPool(10);

    public void start() throws IOException {
        ServerSocket server = new ServerSocket(80);

        while (true) {
            Socket socket = server.accept();
            try {
                exec.execute(() -> System.out.println(socket));
            } catch (RejectedExecutionException e) {
                if (!exec.isShutdown()) {
                    System.out.println("task submission rejected" + e);
                }
            }
        }
    }

    public void stop() {
        exec.shutdown();
    }
}
