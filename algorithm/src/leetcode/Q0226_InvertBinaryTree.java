package leetcode;

import leetcode.common.TreeNode;

public class Q0226_InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return root;
        }
        else{
            TreeNode temp = root.right;

            root.right = invertTree(root.left);

            root.left = invertTree(temp);

        }
        return root;
    }
}
