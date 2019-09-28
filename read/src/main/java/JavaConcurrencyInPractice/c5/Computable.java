package JavaConcurrencyInPractice.c5;

public interface Computable<A, V> {
    V compute(A a) throws InterruptedException;
}
