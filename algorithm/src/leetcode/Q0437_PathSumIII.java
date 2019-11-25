package leetcode;

import leetcode.common.TreeNode;

public class Q0437_PathSumIII {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        int ans = findPath(root, sum);
        ans += pathSum(root.left, sum);
        ans += pathSum(root.right, sum );
        return ans;
    }

    private int findPath(TreeNode node, int sum) {
        int res = 0;
        if (node == null) {
            return 0;
        }
        if (node.val == sum) {
            res = 1;
        }
        res += findPath(node.left, sum - node.val);
        res += findPath(node.right, sum - node.val);
        return res;
    }
}
