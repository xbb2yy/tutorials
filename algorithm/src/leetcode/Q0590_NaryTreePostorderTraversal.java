package leetcode;

import leetcode.common.Node;

import java.util.ArrayList;
import java.util.List;

public class Q0590_NaryTreePostorderTraversal {

    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return list;
        }
        List<Node> children = root.children;
        for (int i = 0; i < children.size(); i++) {
            postorder(children.get(i));
        }
        list.add(root.val);
        return list;
    }
}
