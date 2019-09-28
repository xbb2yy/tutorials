package JavaConcurrencyInPractice.c6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;

public class ThreadPerTaskWebServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(80);
        while (true) {
            Socket socket = server.accept();
            new Thread(() -> handleRequest(socket)).start();
        }
    }

    public static void handleRequest(Socket socket) {
        // handle the request
    }
}

class ThreadPerTaskExecutor implements Executor {
    @Override
    public void execute(Runnable command) {
        new Thread(command).run();
    }
}

class WithinThreadTaskExecutor implements Executor {
    @Override
    public void execute(Runnable command) {
        command.run();
    }
}
