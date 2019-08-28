package leetcode;

import leetcode.common.ListNode;

public class Q0061_RotateList {

    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }
        for (int i = 0; i < k; i++) {
            ListNode t = head;
            ListNode prev = null;
            while (t.next != null) {
                prev = t;
                t = t.next;
            }
            prev.next = null;
            t.next = head;
            head = t;
        }
        return head;
    }

    public static void main(String[] args) {
            ListNode l1 = new ListNode(1);
            ListNode l2 = new ListNode(2);
            ListNode l3 = new ListNode(3);/*
            ListNode l4 = new ListNode(4);
            ListNode l5 = new ListNode(5);*/
  /*      ListNode l6 = new ListNode(4);
        ListNode l7 = new ListNode(5);*/

            l1.next = l2;
            l2.next = l3;
      /*      l3.next = l4;
            l4.next = l5;*/
      /*  l5.next = l6;
        l6.next = l7;*/
            rotateRight(l1, 2000000000);
        }

}
