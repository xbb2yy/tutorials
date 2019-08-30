package leetcode;

import leetcode.common.ListNode;

public class QQ25_ReverseNodesinkGroup {

    public static ListNode reverseKGroup(ListNode head, int k) {

        if (k == 1) {
            return head;
        }

        int n = 1; // 用来计数k
        ListNode newHead = null;
        ListNode start = head;
        ListNode end;
        ListNode prev = null;
        ListNode last = null;

        while (start != null) {
            end = start;
            while (end.next != null && n < k) {
                prev = end;
                end = end.next;
                n++;
            }
            if (n < k) {
                return newHead == null ? head : newHead;
            }

            if (k == 2) {
                if (newHead == null) {
                    newHead = end;
                }
                ListNode tmp = end.next;
                end.next = start;
                if (last != null) {
                    last.next = end;
                }
                start.next = tmp;
                last = start;
                start = tmp;
                n = 1;
            } else {
                if (newHead == null) {
                    newHead = end;
                }
                ListNode tmp = end.next;
                end.next = start.next;
                if (last != null) {
                    last.next = end;
                }
                prev.next = start;
                start.next = tmp;

                last = start;
                start = tmp;
                n = 1;
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
