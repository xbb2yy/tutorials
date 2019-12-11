package leetcode;

import leetcode.common.ListNode;
import leetcode.common.Pass;

@Pass
public class Q0083_RemoveDuplicatesfromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }
        int prev = head.val;
        ListNode node = head;
        while (node != null) {
            if (node.next == null) {
                return head;
            }
            if (node.next.val == prev) {
                node.next = node.next.next;
            } else {
                prev = node.next.val;
                node = node.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println((int)'z');
    }
}
