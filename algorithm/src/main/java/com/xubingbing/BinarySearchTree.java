package com.xubingbing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BinarySearchTree<E extends Comparable<E>> {

    private Node root;
    private int size;

    public void put(E e) {
        if (null == root) {
            root = new Node(e);
            size++;
            return ;
        }
        put(root, e);
    }

    private void put(Node node, E e) {
        if (e.compareTo(node.e) < 0) {
            if (null == node.left) {
                node.left = new Node(e);
                size++;
            } else {
                put(node.left, e);
            }
        }

        if (e.compareTo(node.e) > 0) {
            if (null == node.right) {
                node.right = new Node(e);
                size++;
            } else {
                put(node.right, e);
            }
        }
    }

    public void forEach() {
        if (null == root) {
            System.out.println("Empty tree");
        }

        List<Node> node = new ArrayList<Node>();
        node.add(root);
        list(node);
    }

    private void list(List<Node> nodes) {
        if (nodes.size() == 0) {
            return;
        }
        List<Node> n = new ArrayList<Node>();
        for (Node node : nodes) {
            System.out.print(node.e + " ");
        }
        System.out.println();
        for (Node node : nodes) {
            if (null != node.left) n.add(node.left);
            if (null != node.right) n.add(node.right);
        }
        list(n);

    }

    private  class Node {
        E e;
        Node right, left;

        public Node(E e) {
            this.e = e;
        }
    }

    public int size() {
        return size;
    }
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        Random random = new Random();
        for (int i = 0; i < 100 ; i++) {
            tree.put(random.nextInt(200));
        }
        tree.forEach();
    }
}
