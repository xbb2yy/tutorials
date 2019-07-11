package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0203_RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {

        ListNode node = head;
        ListNode next = head;
        ListNode prev = null;
        while (next != null) {
            if (next.val == val) {
                if (prev == null) {
                next = node = node.next;
                } else {
                    prev.next = next.next;
                    next = next.next;
                }
            } else {
                prev = next;
                next = next.next;
            }
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
      /*  ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);*/


        node1.next = node2;
      /*  node3.next = node4;
        node4.next = node5;
        node5.next = node6;*/

        removeElements(node1, 1);
    }
}
