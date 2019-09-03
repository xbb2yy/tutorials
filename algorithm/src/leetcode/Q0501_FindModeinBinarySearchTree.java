package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q0501_FindModeinBinarySearchTree {


    static int max = 0;
    static int count = 0;

    static Integer prev = null;

    public static int[] findMode(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        solution(root, list);
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }

    public static void solution(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        solution(node.left, list);
        if (prev == null) {
            prev = node.val;
            max = 1;
            count++;
            list.add(node.val);
        } else {
            if (prev == node.val) {
                count++;
                if (count == max) {
                    list.add(node.val);
                }
                if (count > max) {
                    list.clear();
                    list.add(node.val);
                    max = count;
                }
            } else {
                count = 1;
                if (max == 1) {
                    list.add(node.val);
                }
                prev = node.val;
            }

        }
        solution(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(2147483647);
       /* TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2147483647);
        t1.right = t2;
        t2.left = t3;*/

        findMode(t1);
    }
}
