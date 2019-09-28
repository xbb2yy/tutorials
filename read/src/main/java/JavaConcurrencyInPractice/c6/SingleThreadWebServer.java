package JavaConcurrencyInPractice.c6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleThreadWebServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(80);
        while (true) {
            Socket socket = server.accept();
            handleRequest(socket);
        }
    }

    public static void handleRequest(Socket socket) {
        // handle the request
    }
}
