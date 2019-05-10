package JavaConcurrencyInPractice.c3;

public class ThisEscape {

    public ThisEscape(EventSource source) {
        source.registerListener(e -> System.out.println(ThisEscape.this));
    }
}

class EventSource {
    void registerListener(EventListener listener) {
    }
}

interface EventListener {
    void onEvent(Object e);
}