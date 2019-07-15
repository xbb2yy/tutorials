package leetcode;

import leetcode.common.Pass;

import java.util.HashSet;
import java.util.Set;

@Pass
public class Q0141_LinkedListCycle {

    public static boolean hasCycle(ListNode head) {

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

    public static void main(String[] args) {
       /* ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        hasCycle(node1);*/

        System.out.println(785&234&23&25&456&23&25&456);
    }
}
