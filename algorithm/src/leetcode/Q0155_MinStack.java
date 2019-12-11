package leetcode;

import java.util.LinkedList;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 */
public class Q0155_MinStack {

    private Node top;

    class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }


    /** initialize your data structure here. */
    public Q0155_MinStack() {

    }

    public void push(int x) {
        if (top == null) {
            top = new Node(x, null);
            return;
        } else {
            top = new Node(x, top);
        }

    }

    public void pop() {
        if (top != null) {
            top = top.next;
        }
    }

    public int top() {
        if (top != null) {
            return top.val;
        }
        return -1;
    }

    public int getMin() {
        int min = top.val;
        Node tmp = top;

        while (tmp != null) {
            if (tmp.val < min) {
                min = tmp.val;
            }
            tmp = tmp.next;
        }

        return min;
    }
}

class MinStack {

    private LinkedList<Integer> list = new LinkedList<>();
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
       list.addLast(x);
    }

    public void pop() {
        list.removeLast();
    }

    public int top() {
        return list.getLast();
    }

    public int getMin() {
       return list.stream().min(Integer::compareTo).get();
    }
}
