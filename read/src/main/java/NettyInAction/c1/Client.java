package NettyInAction.c1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 80);
        OutputStream out = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
        writer.write("hello");

    }
}
