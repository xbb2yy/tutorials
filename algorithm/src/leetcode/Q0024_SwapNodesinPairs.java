package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0024_SwapNodesinPairs {
    public static ListNode swapPairs(ListNode head) {

        ListNode h = head;
        ListNode l = head;
        ListNode prev = null;
        while (l != null) {
            if (l.next == null) {
                if (prev != null) {
                    prev.next = l;
                }
                return h;
            }
            ListNode tmp = l.next.next;
            if (prev == null) {
                h = l.next;
                prev = l;
                l.next.next = l;
                l.next = null;
            } else {
                prev.next = l.next;
                l.next.next = l;
                l.next = null;
                prev = l;
            }
            l = tmp;

        }
        return h;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);

        l1.next = l2;


        swapPairs(l1);

    }
}
