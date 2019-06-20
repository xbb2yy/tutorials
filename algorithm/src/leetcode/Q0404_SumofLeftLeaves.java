package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

@Pass
public class Q0404_SumofLeftLeaves {

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        sum(root);
        return sum;
    }

    private void sum(TreeNode root) {

        if (root == null) {
            return;
        }

        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        sum(root.left);
        sum(root.right);
    }
}
