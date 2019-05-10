package JavaConcurrencyInPractice.c2;

public class LazyInitRace {
    private static LazyInitRace singleton;

    private LazyInitRace() {

    }

    public static LazyInitRace getSingleton() {
        if (singleton != null) {
            singleton = new LazyInitRace();
        }
        return singleton;
    }
    
}
