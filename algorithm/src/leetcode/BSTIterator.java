package leetcode;

import leetcode.common.Pass;
import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Pass
class BSTIterator {

    private List<Integer> vals = new ArrayList<>();
    int pointer = 0;

    public BSTIterator(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> nodes = new Stack<>();

        nodes.push(root);
        while (!nodes.empty()) {
            TreeNode top = nodes.pop();
            if (top.left == null && top.right == null) {
                vals.add(top.val);
            } else {
                if (top.right != null) {
                    nodes.push(top.right);
                }
                nodes.push(top);
                if (top.left != null) nodes.push(top.left);
                top.left = null;
                top.right = null;
            }
        }
    }
    
    /** @return the next smallest number */
    public int next() {
       return vals.get(pointer++);
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return pointer < vals.size();
    }
}