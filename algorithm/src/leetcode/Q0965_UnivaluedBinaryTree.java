package leetcode;


@Pass
public class Q0965_UnivaluedBinaryTree {

    private int val;

    public boolean isUnivalTree(TreeNode root) {
        val = root.val;
        return visit(root);

    }

    public boolean visit(TreeNode node) {
        if (node == null) {
            return true;
        }

        int val = node.val;
        if (val != this.val) {
            return false;
        }
        return visit(node.left) && visit(node.right);

    }


}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
 }
