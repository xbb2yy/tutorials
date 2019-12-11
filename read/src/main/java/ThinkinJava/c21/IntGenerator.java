package ThinkinJava.c21;

public abstract class IntGenerator {
    private volatile boolean cancelled = false;

    public abstract int next();

    public void cancel() {
        cancelled = true;
    }

    public boolean isCancelled() {
        return cancelled;
    }
}
