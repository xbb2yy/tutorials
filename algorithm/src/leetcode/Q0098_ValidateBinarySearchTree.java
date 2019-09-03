package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

@Pass
public class Q0098_ValidateBinarySearchTree {

    private static Integer prev;
    public static boolean isValidBST(TreeNode root) {
       List<Integer> list = new ArrayList<>();
        visit(root, list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)) return false;
        }
        return true;
    }

    public static void visit(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        visit(node.left, list);
        list.add(node.val);
        visit(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(6);
        TreeNode t5 = new TreeNode(20);

        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;

        System.out.println(isValidBST(t1));
    }
}
