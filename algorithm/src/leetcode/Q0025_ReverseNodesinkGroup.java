package leetcode;

import leetcode.common.ListNode;

public class Q0025_ReverseNodesinkGroup {

    public static ListNode reverseKGroup(ListNode head, int k) {

        if (k == 1) {
            return head;
        }
        ListNode newHead = null;
        ListNode start = head;
        ListNode next;
        ListNode prev = null;

        while (start != null) {
            int n = 1;
            next = start;
            ListNode h = null;
            while (n <= k && next != null) {
                if (h == null) {
                    ListNode t = next.next;
                    h = next;
                    h.next = null;
                    next = t;
                } else {
                    ListNode t = next.next;
                    next.next = h;
                    h = next;
                    next = t;
                }
                n++;
            }
            if (newHead == null) {
                newHead = h;
            }
            if (n < k) {
                prev.next = start;
                return newHead;
            }
            if (prev == null) {
                prev = next;
            } else {
                prev.next = h;
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        // l4.next = l5;

        reverseKGroup(l1, 4);
    }
}
