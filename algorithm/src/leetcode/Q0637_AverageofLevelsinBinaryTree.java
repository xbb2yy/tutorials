package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Pass
public class Q0637_AverageofLevelsinBinaryTree {

    private List<List<Integer>> list = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return ans;
        queue.add(root);

        while (queue.size() != 0) {
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null) queue.add(poll.left);
                if (poll.right != null) queue.add(poll.right);
                sum += poll.val;
            }
            ans.add(sum / size);
        }
        return ans;
    }

}
