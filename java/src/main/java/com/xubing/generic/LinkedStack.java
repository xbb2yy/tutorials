package com.xubing.generic;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/8/10 11:09
 */
public class LinkedStack<T> {

    private static class Node<U> {
        U item;
        Node<U> next;
        Node() {
            this.item = null;
            this.next = null;
        }
        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>();

    public void push(T item) {
        Node<T> node = new Node<>(item, top);
        this.top = node;
    }

    public T pop() {
        T item = top.item;
        if(!top.end()) {
            top = top.next;
        }
        return item;
    }

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        for (String s : "i,love,jiangyuan".split(",")) {
            stack.push(s);
        }

        String s;
        while ((s = stack.pop())!= null) {
            System.out.println(s);
        }
    }

}
