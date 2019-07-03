package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

@Pass
public class Q0993_CousinsinBinaryTree {
    public static boolean isCousins(TreeNode root, int x, int y) {

        String a = parentsAndDepth(null, root, x, 0);
        String b = parentsAndDepth(null, root, y, 0);

        if (a == null || b == null) {
            return false;
        }
        String[] a1 = a.split(":");
        String[] b1 = b.split(":");
        return !a1[0].equals(b1[0]) && a1[1].equals(b1[1]);

    }


    public static String parentsAndDepth(TreeNode parent, TreeNode node, int val, int depth) {

        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return parent == null ? null : parent.val + ":" + depth;
        }

        int i = ++depth;
        String l = parentsAndDepth(node, node.left, val, i);
        String r = parentsAndDepth(node, node.right, val, i);

        if (l != null) {
            return l;
        }

        if (r != null) {
            return r;
        }
        return null;

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);

        root.left = t2;
        root.right = t3;

        t2.right = t4;
        t3.right = t5;

        System.out.println(isCousins(root, 4, 5));


    }


}
