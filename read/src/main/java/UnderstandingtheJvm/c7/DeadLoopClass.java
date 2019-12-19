package UnderstandingtheJvm.c7;

public  class DeadLoopClass {

    static {
        if (true) {
            System.out.println(Thread.currentThread().getName() +  "Init dead loop class");
            while (true) {
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + ": start");
                new DeadLoopClass();
                System.out.println(Thread.currentThread() + ": end");
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
    }


}
