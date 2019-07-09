package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q0938_RangeSumofBST {

     int L,R;

    public  int rangeSumBST(TreeNode root, int L, int R) {
        this.L = L;
        this.R = R;
        List<Integer> list = new ArrayList<>();
        sum(root, list);
        System.out.println(list);
        return list.stream().reduce(0, (x, y) -> x + y);

    }

    public  void sum(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (node.val<=R && node.val>=L) {
            list.add(node.val);
        }
        sum(node.right, list);
        sum(node.left, list);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode r1 = new TreeNode(5);
        TreeNode r2 = new TreeNode(15);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(7);
        TreeNode r5 = new TreeNode(18);

        root.left = r1;
        root.right = r2;
        r1.left = r3;
        r1.right = r4;

        r2.right=r5;


        new Q0938_RangeSumofBST().rangeSumBST(root, 7, 15);
    }
}
