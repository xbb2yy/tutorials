package leetcode;

public class Q0206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode h = head; ListNode n = null;
        while (h != null) {
            ListNode tmp = h.next;
            h.next = n;
            n = h;
            h = tmp;
        }
        return n;
    }

    public static void main(String[] args) {

    }
}
