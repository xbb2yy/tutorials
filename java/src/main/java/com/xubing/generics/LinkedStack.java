package com.xubing.generics;

import java.util.Objects;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/10 11:09
 */
public class LinkedStack<T> {

    private class Node<U> {
        private Node next;
        private U u;

        public Node(Node next, U u) {
            this.next = next;
            this.u = u;
        }


    }

    private Node<T> top;

    public void push(T t) {
        if (top == null) {
            top = new Node<>(null, t);
            return;
        }
        top = new Node<>(top, t);
    }

    public T pop() {
        if (top != null) {
            T u = top.u;
            top = top.next;
            return u;
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        for (String s : "I LOVE YOU".split(" ")) {
            stack.push(s);
        }

        String s;
        while ((s = stack.pop()) != null) {
            System.out.println(s);
        }
    }

}
