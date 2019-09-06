package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

@Pass
public class Q0102_BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        add(root, list, 0);
        return list;
    }

    public static void add(TreeNode node, List<List<Integer>> list, int i) {
        if (node == null) {
            return;
        }
        if (list.size() <= i) {
            List<Integer> t = new ArrayList<>();
            t.add(node.val);
            list.add(t);
        } else {
            List<Integer> list1 = list.get(i);
            list1.add(node.val);
        }
        i++;
        add(node.left, list, i);
        add(node.right, list, i);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);

        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;

        levelOrder(t1);
    }
}
