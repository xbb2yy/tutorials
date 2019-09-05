package leetcode;

import leetcode.common.ListNode;
import leetcode.common.Pass;

@Pass
public class Q0092_ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }

        int start = 1;
        ListNode node = head, prev = null;
        while (start < m) {
            prev = node;
            node = node.next;
            start++;
        }

        ListNode tmp = null, end = null;
        while (start >= m && start <= n) {
            ListNode t = node.next;
            if (tmp == null) {
                tmp = node;
                tmp.next = null;
                end = tmp;
            } else {
                node.next = tmp;
                tmp = node;
            }
            node = t;
            start++;
        }

        end.next = node;
        if (prev == null) {
            return tmp;
        }
        prev.next = tmp;
        return head;
    }
}
