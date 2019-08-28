package leetcode;


import leetcode.common.ListNode;
import leetcode.common.Pass;

/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * If there are two middle nodes, return the second middle node.
 * <p>
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 */
@Pass
public class Q0876_MiddleoftheLinkedList {

    public static ListNode middleNode(ListNode head) {

        ListNode tmp = head;
        int i = 0;
        while (tmp != null) {
            i++;
            tmp = tmp.next;
        }

        ListNode l = head;
        for (int k = 0; k < i / 2; k++) {
            l = l.next;
        }

        return l;
    }
}


