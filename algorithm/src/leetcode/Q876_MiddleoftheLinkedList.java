package leetcode;

public class Q876_MiddleoftheLinkedList {

    public static ListNode middleNode(ListNode head) {

        ListNode tmp = head;
        int i = 0;
        while (tmp != null) {
            i++;
            tmp = tmp.next;
        }


        ListNode l = head;
        for (int k = 0; k < i / 2 ; k++) {
            l = l.next;
        }

        return l;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
