package JavaConcurrencyInPractice.c3;

import java.util.HashSet;

public class ThreeStorages {
    private final HashSet<String> storages = new HashSet<>();

    public ThreeStorages() {
        storages.add("yuan");
        storages.add("yuan1");
        storages.add("yuan2");
    }

    public boolean isStorage(String items) {
        return storages.contains(items);
    }
}
