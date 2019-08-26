package leetcode;

public class Q0082_RemoveDuplicatesfromSortedListII {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode h = null;
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            int val = cur.val;
            ListNode t = cur.next;
            boolean dup = false;
            while (t != null && t.val == val) {
                t = t.next;
                dup = true;
            }
            if (!dup) {
                if (h == null) {
                    h = cur;
                }
                prev = cur;
                cur = cur.next;
            } else {
                if (prev != null) {
                    prev.next = t;
                }
                cur = t;
            }

        }

        return h;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(3);
  /*      ListNode l6 = new ListNode(4);
        ListNode l7 = new ListNode(5);*/

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
      /*  l5.next = l6;
        l6.next = l7;*/
        deleteDuplicates(l1);
    }
}
