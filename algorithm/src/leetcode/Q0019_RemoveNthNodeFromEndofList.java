package leetcode;

import leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Q0019_RemoveNthNodeFromEndofList {


    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode t = head;
        while (t != null) {
            list.add(t);
            t = t.next;
        }
        ListNode node = list.get(list.size() - n);
        if (node.next == null) {
            if (node == head) {
                head = null;
            } else {
               list.get(list.size() - n - 1).next = null;
            }

        } else {
            node.val = node.next.val;
            node.next = node.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        node.next = node1;
        removeNthFromEnd(node, 1);
    }
}
