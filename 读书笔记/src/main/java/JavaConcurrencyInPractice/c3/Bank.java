package JavaConcurrencyInPractice.c3;

public class Bank {
    private ThreadLocal<Long> local = ThreadLocal.withInitial(() -> 100L);

    public Long get() {
        return local.get();
    }

    public void set() {
        local.set(local.get() + 10);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Transfer transfer = new Transfer(bank);
        Thread t1 = new Thread(transfer);
        Thread t2 = new Thread(transfer);
        t1.start();
        t2.start();
        System.out.println(bank.get());
    }
}

class Transfer implements Runnable {

    private Bank bank;

    public Transfer(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            bank.set();
        }

        System.out.println(Thread.currentThread() + ":" + bank.get());
    }
}
