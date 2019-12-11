package leetcode;

import leetcode.common.TreeNode;

public class Q0543_DiameterofBinaryTree {

    public static int diameterOfBinaryTree(TreeNode root) {
        int ans = 0;
        if (root == null) return ans;
        if (root.left != null) {
            ans += help(root.left) ;
        }
        if (root.right != null) {
            ans += help(root.right) ;
        }
        return ans;
    }

    public static int help(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(help(node.left), help(node.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        diameterOfBinaryTree(root);
    }
}
