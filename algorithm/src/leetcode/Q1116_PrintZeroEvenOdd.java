package leetcode;

import java.awt.event.ActionEvent;
import java.util.function.IntConsumer;

public class Q1116_PrintZeroEvenOdd {

}

class ZeroEvenOdd {
    private int n;

    private Object o1 = new Object();

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {

    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        printNumber.accept(1);
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        printNumber.accept(2);
    }
}