package com.xubing.generics;

import com.sun.org.apache.xpath.internal.operations.String;
import com.xubing.generics.泛型接口.Generator;

public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override

    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static <S> Generator<S> create(Class<S> type) {
        return new BasicGenerator<>(type);
    }

    public static void main(String[] args) {
        Generator<String> generator = BasicGenerator.create(String.class);
        System.out.println(generator.next());
        BasicGenerator<Foo> generator1 = new BasicGenerator<>(Foo.class);
        generator1.next();
    }
}
