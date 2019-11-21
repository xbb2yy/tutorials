package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q0095_UniqueBinarySearchTreesII {

    private List<TreeNode> ans = new ArrayList<>();

    public List<TreeNode> generateTrees(int n) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        help(null, list);
        return ans;
    }

    private void help(TreeNode root, List<Integer> list) {
        if (list.size() == 0) {
            ans.add(root);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            TreeNode gen = gen(root, integer);
            ArrayList<Integer> integers = new ArrayList<>(list);
            integers.remove(i);
            help(gen, integers);
        }
    }

    private TreeNode gen(TreeNode root, int n) {
        if (root == null) {
            return new TreeNode(n);
        } else {
            TreeNode newNode = new TreeNode(root.val);
            newNode.left = root.left;
            newNode.right = root.right;
            add(newNode, n);
            return newNode;
        }
    }

    private void add(TreeNode root, int n) {
        if (n > root.val) {
            if (root.right == null) {
                TreeNode node = new TreeNode(n);
                root.right = node;
            } else {
                add(root.right, n);
            }
        }
        if (n < root.val) {
            if (root.left == null) {
                TreeNode node = new TreeNode(n);
                root.left = node;
            } else {
                add(root.left, n);
            }
        }
    }

    public static void main(String[] args) {
        Q0095_UniqueBinarySearchTreesII q = new Q0095_UniqueBinarySearchTreesII();
        q.generateTrees(3);
        System.out.println(q.ans);
    }
}
