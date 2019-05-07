package JavaConcurrencyInPractice.c5;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class CompositeVector {

    private List list = new Vector();

    public CompositeVector() {
        list.add(1);
        list.add(3);
    }

    public Object getLast() {
        int i = list.size();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            // do nothing
        }
        return list.get(i - 1);
    }

    public void removeLast() {
        int i = list.size();
        list.remove(i - 1);
    }

    public static void main(String[] args) {
        CompositeVector compositeVector = new CompositeVector();
        new Thread(() -> compositeVector.getLast()).start();
        // new Thread(() -> compositeVector.removeLast()).start();

        LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue<>();
        while (true) {
            try {
                queue.put(new String("QRWEWQRWQRWQERWREWR"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
