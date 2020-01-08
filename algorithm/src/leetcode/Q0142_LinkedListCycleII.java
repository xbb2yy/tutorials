package leetcode;

import leetcode.common.ListNode;
import leetcode.common.TreeNode;

import java.util.HashSet;

public class Q0142_LinkedListCycleII {

    public ListNode detectCycle(ListNode head, int pos) {
        HashSet<ListNode> set = new HashSet<>();

        while (head != null && !set.contains(head)) {
            set.add(head);
            if (set.contains(head)) {
                return head;
            }
            head = head.next;
        }
        return null;

    }
}
