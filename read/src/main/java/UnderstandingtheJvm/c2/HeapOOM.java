package UnderstandingtheJvm.c2;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

    /**
     * -Xms20m
     * -Xmx20m
     * -XX:+HeapDumpOnOutOfMemoryError
     * @param args
     */
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while (true) {
            list.add(new Object());
        }
    }
}
