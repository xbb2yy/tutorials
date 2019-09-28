package JavaConcurrencyInPractice.c4;

import java.util.HashSet;
import java.util.Set;

public class PersonSet {
    private final Set<Person> personSet = new HashSet<>();

    public synchronized void add(Person person) {
        personSet.add(person);
    }

    public synchronized boolean contains(Person person) {
        return personSet.contains(person);
    }
}

class Person {}
