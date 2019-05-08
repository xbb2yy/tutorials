package JavaConcurrencyInPractice.c6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TaskExecutionWebServer {
    public static final int NTHREADS = 10;
    private static final Executor exec = Executors.newFixedThreadPool(NTHREADS);

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(80);
        while (true) {
            Socket socket = server.accept();
            exec.execute(() -> handleRequest(socket));
        }
    }

    public static void handleRequest(Socket socket) {
        // handle the request
    }
}
