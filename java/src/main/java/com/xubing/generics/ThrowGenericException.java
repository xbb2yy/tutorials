package com.xubing.generics;

public class ThrowGenericException {
    public static void main(String[] args) {
        ProcessRunner<String, Failure1> runner =
                new ProcessRunner<String, Failure1>();
        for (int i = 0; i < 3; i++)
            runner.add(new Processor1());
        try {
            System.out.println(runner.processAll());
        } catch (Failure1 e) {
            System.out.println(e);
        }
        ProcessRunner<Integer, Failure2> runner2 =
                new ProcessRunner<Integer, Failure2>();
        for (int i = 0; i < 3; i++)
            runner2.add(new Processor2());
        try {
            System.out.println(runner2.processAll());
        } catch (Failure2 e) {
            System.out.println(e);
        }
    }
} ///:~