package leetcode;

import leetcode.common.ListNode;
import leetcode.common.Pass;

@Pass
public class Q0237_DeleteNodeinaLinkedList {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
