package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Pass
public class Q0199_BinaryTreeRightSideView {

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> queen = new LinkedList<>();
        if (root == null) return ans;
        queen.add(root);
        while (queen.size() != 0) {
            int size = queen.size();
            for(int i = 0; i < size; i++) {
                TreeNode pop = queen.poll();
                if (pop.left != null) queen.add(pop.left);
                if (pop.right != null) queen.add(pop.right);
                if (i == size - 1) ans.add(pop.val);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);
        root.left = node1; root.right = node2;
        node1.right = node3; node2.right = node4;
        rightSideView(root);
    }
}
