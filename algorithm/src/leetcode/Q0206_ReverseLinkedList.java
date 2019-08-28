package leetcode;

import leetcode.common.ListNode;

/**
 * 链表的翻转
 */
public class Q0206_ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
       ListNode n = null; ListNode cur = head;
        while (cur != null) {
           ListNode tmp = cur.next;
           cur.next = n;
           n = cur;
           cur = tmp;
        }
        return n;
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
        l4.next = l5;
        reverseList(l1);

     }
}


