package JavaConcurrencyInPractice.c16;

import java.util.HashMap;
import java.util.Map;

public class SafeStates {

    private final Map<String, String> states;

    public SafeStates() {
        states = new HashMap<>();
        states.put("a", "a");
        states.put("a1", "a1");
        states.put("a2", "a2");
        states.put("a3", "a3");
    }

    public String get(String string) {
        return states.get(string);
    }
}
