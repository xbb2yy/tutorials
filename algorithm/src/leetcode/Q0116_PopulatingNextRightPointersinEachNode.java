package leetcode;

import leetcode.common.Pass;

import java.util.LinkedList;
import java.util.Queue;

@Pass
public class Q0116_PopulatingNextRightPointersinEachNode {

    public Node connect(Node root) {

        if (root == null)
            return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
            int size = queue.size();
            Node prev = null;
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                if (prev == null) {
                    prev = poll;
                } else {
                    prev.next = poll;
                    prev = poll;
                }
                if (poll.left != null)
                    queue.add(poll.left);
                if (poll.right != null)
                    queue.add(poll.right);
            }
        }
        return root;
    }
}
