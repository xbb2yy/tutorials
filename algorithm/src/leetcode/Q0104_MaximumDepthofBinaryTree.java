package leetcode;

import leetcode.common.TreeNode;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Q0104_MaximumDepthofBinaryTree {


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        length(root, set, 1);

        Optional<Integer> max = set.stream().max(Integer::compareTo);
        return max.orElse(0);

    }


    private void length(TreeNode node, Set<Integer> set, int length) {

        if (node.right == null && node.left == null) {
            set.add(length);
        }

        if (node.left != null) {
            length(node.left, set, length + 1);
        }

        if (node.right != null) {
            length(node.right, set, length + 1);
        }
    }
}
