package JavaConcurrencyInPractice.c3;

public class NoVisibility {

    public static int num;
    public static boolean flag;

    static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!flag) {
                Thread.yield();
            }
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        new ReadThread().start();
        num = 1;
        flag = true;
    }

}
