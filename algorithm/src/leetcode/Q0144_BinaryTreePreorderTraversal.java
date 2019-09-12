package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q0144_BinaryTreePreorderTraversal {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
