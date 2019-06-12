package leetcode;

import java.util.HashSet;
import java.util.Set;

@Pass
public class Q0112_PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        count(root, set, root.val);
        return set.contains(sum);

    }


    private void count(TreeNode node, Set<Integer> set, int currrent) {

        System.out.println(currrent);
        if (node != null && node.left == null && node.right == null) {
            set.add(currrent);
        }

        if (node.left != null) {
            count(node.left, set, currrent + node.left.val);
        }
        if (node.right != null) {
            count(node.right, set, currrent + node.right.val);
        }

    }
}

