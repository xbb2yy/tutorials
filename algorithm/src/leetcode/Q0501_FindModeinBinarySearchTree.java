package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q0501_FindModeinBinarySearchTree {


    static int  max = 0;
    static int count = 0;
    /**
     * 暴力解法超时;
     * @param root
     * @return
     */
    public  int[] findMode(TreeNode root) {
        Map<Integer, Integer> m = new HashMap<>();
        visit(root, m);
        List<Integer> collect = m.entrySet().stream().filter(e -> e.getValue() == m.values().stream().max(Integer::compareTo).get())
                .map(Map.Entry::getKey).collect(Collectors.toList());

        int[] ints = new int[collect.size()];
        for (int i = 0; i < collect.size(); i++) {
            ints[i] = collect.get(i);
        }
        return ints;

    }

    private  void visit(TreeNode node, Map<Integer, Integer> map) {
        if (node == null) {
            return;
        }
        map.compute(node.val, (key, old) -> {
            if (old == null) {
                return 1;
            } else {
                return ++old;
            }
        });
        visit(node.right, map);
        visit(node.left, map);
    }

    public static int[] solution(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        max = 1;
        solution(root.left, root.val, list);
        solution(root.right, root.val, list);
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }

    public static void solution(TreeNode node, int prev, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.val == prev) {
            count++;
            solution(node.left, prev, list);
            solution(node.right, prev, list);
        } else {
            if (count > max) {
                list.clear();
                list.add(prev);
            }
            if (count == max) {
                list.add(prev);
            }
            count = 1;
            solution(node.left, node.val, list);
            solution(node.right, node.val, list);
        }

    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2147483647);
        t1.right = t2;
        t2.left = t3;

       // findMode(t3);
    }
}
