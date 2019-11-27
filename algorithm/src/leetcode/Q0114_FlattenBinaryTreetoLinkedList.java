package leetcode;

import leetcode.common.TreeNode;

import java.util.Stack;

public class Q0114_FlattenBinaryTreetoLinkedList {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode tmp = null;
        stack.push(root);
        while (!stack.empty()) {
            TreeNode top = stack.pop();
            if (top.right != null) stack.push(top.right);
            if (top.left != null) stack.push(top.left);
            if (tmp == null) {
                tmp = top;
                tmp.left = null;
            } else {
                tmp.right = top;
                tmp.left = null;
                tmp = top;
            }
        }
    }
}
