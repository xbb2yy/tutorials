package JavaConcurrencyInPractice.c3;

public class NoVisibility {

    public int num = 88;
    public boolean flag;

    class ReadThread extends Thread {
        @Override
        public void run() {
            while (!flag) {
                Thread.yield();
            }
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            NoVisibility noVisibility = new NoVisibility();
            noVisibility.new ReadThread().start();
            noVisibility.flag = true;
            noVisibility.num = 42;
        }
    }

}
