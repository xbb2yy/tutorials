package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

import java.util.*;

@Pass
public class Q0103_BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean fromLeft = true;
        while (queue.peek() != null) {
            LinkedList<Integer> level = new LinkedList<>();
            // 先获取队列当前的长度，然后遍历，是关键
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (fromLeft) {
                    level.addLast(poll.val);
                } else {
                    level.addFirst(poll.val);
                }
                if (poll.left != null) {
                    queue.add(poll.left);
                }
                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }
            ans.add(level);
            fromLeft = !fromLeft;
        }
        return ans;
    }
}
