package leetcode;

import leetcode.common.Pass;

import java.util.HashSet;
import java.util.Set;

@Pass
public class Q0141_LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        ListNode current = head;

        Set<ListNode> set = new HashSet<>();

        while (current!= null && !set.contains(current)) {
            set.add(current);
            current = current.next;
        }

        if (current == null) {
            return false;
        }
        return true;
    }
}
