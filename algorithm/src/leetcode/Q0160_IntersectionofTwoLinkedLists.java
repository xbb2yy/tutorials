package leetcode;

import leetcode.common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Q0160_IntersectionofTwoLinkedLists {

    /**
     * O(n^2 O(1))
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a1 = headA;
        while (a1 != null) {
            ListNode b1 = headB;
            while (b1 != null) {
                if (a1 == b1) {
                    return a1;
                }
                b1 = b1.next;
            }
            a1 = a1.next;
        }
        return null;
    }

    /**
     * O(n) O(n)
     * @param headA
     * @param headB
     * @return
     */
    public ListNode solution(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode a1 = headA;
        while (a1 != null) {
            set.add(a1);
            a1 = a1.next;
        }

        ListNode a2 = headB;
        while (a2 != null) {
            if (set.contains(a2)) {
                return a2;
            }
            a2 = a2.next;
        }
        return null;
    }
}
