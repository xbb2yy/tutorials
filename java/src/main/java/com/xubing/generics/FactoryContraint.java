package com.xubing.generics;

public class FactoryContraint {
    public static void main(String[] args) {
        Foo2<Integer> integerFoo2 = new Foo2<>(new IntegerFactory());
        Foo2<Widget> widgetFoo2 = new Foo2<>(new Widget.Factory());
    }
}

interface FactoryI<T> {
    T create();
}

class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create() {
        return new Integer(0);
    }
}

class Widget {
    public static class Factory implements FactoryI<Widget> {
        @Override
        public Widget create() {
            return new Widget();
        }
    }
}
