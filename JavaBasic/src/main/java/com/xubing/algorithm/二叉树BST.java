package com.xubing.algorithm;

/**
 * @author xubingbing xbbjava@163.com
 * @date 2018/10/26 9:56
 */
public class 二叉树BST {
    public static void main(String[] args) {
        BST<String, String> bst = new BST<>();

        bst.put("hello", "world1");
        bst.put("hello1", "world1");
        bst.put("hello2", "world2");
        bst.put("hello3", "world3");
        bst.put("hello4", "world4");
        bst.put("hello5", "world5");
        bst.put("hello6", "world6");
        bst.put("hello3", "1");


        System.out.println(bst.size());
        System.out.println(bst.get("hello3"));
    }
}


class BST<K extends Comparable, V> {

    private Node root;

    private class Node {
        K key;
        V value;
        Node right, left;
        int size;

        public Node(K k, V v, int size) {
            this.key = k;
            this.value = v;
            this.size = size;
        }
    }

    public int size() {
        return size(root);
    }


    private int size(Node node) {
        if (null == node) {
            return 0;
        }
        return node.size;
    }

    public void put(K key, V value) {
       root = put(root, key, value);
    }

    private Node put(Node node, K key, V value) {

        if (null == node) {
            return new Node(key, value, 1);
        }

        int cmp = key.compareTo(node.key);

        if (cmp < 0) {
            node.left =  put(node.left, key, value);
        } else if (cmp > 0) {
           node.right =  put(node.right, key, value);
        } else {
            node.value = value;
        }

        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public V get(K key) {
        return  get(root, key);
    }

    private V get(Node node, K key) {

        if (null == node) {
            return null;
        }
        if (node.key == key) {
            return node.value;
        }

        if (node.key.compareTo(key) < 0) {
            return get(node.right, key);
        } else {
            return get(node.left, key);
        }

    }

    public Node getRoot(K key, V value) {
        return new Node(key, value, 1);
    }
}
