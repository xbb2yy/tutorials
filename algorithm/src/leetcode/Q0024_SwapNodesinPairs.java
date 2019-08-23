package leetcode;

public class Q0024_SwapNodesinPairs {
    public static ListNode swapPairs(ListNode head) {

        ListNode h = head;
        ListNode l = head;
        ListNode prev = null;
        while (l != null) {
            if (l.next == null) {
                prev.next = l;
                return h;
            }
            ListNode tmp = l.next.next;
            if (prev == null) {
                h = l.next;
                prev = l;
                l.next.next = l;
            } else {
                prev.next = l.next;
                l.next.next = l;
                prev = l;
            }
            l = tmp;

        }
        return h;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        swapPairs(l1);

    }
}
