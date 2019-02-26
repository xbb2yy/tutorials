package com.xubing.generic;

import java.math.BigInteger;
import java.util.*;

public class CollectionClassifier {
    public String classify(Set<?> s) {
        return "Set";
    }

    public String classify(List<?> lst) {
        return "List";
    }

    public  String classify(Collection<?> c) {
        return "Unknown Collection";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>(16).values()
        };

        for (Collection<?> c : collections) {
            System.out.println(new CollectionClassifier().classify(c));
        }

    }
}