package leetcode;

import leetcode.common.Pass;

@Pass
public class Q0021_MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode tmp = l2;
        while (tmp != null) {
            ListNode a = tmp.next;
            tmp.next = null;
            ListNode cur = l1;
            ListNode prev = null;
            while (cur != null) {
                if (cur.next == null) {
                    if (tmp.val > cur.val) {
                        cur.next = tmp;
                        break;
                    } else {
                        if (prev != null) {
                            prev.next = tmp;
                            tmp.next = cur;
                            break;
                        } else {
                            tmp.next = cur;
                            l1 = tmp;
                            break;
                        }
                    }
                }
                if (tmp.val > cur.val) {
                    prev = cur;
                    cur = cur.next;
                } else {
                    if (prev != null) {
                        prev.next = tmp;
                        tmp.next = cur;
                        break;
                    } else {
                        tmp.next = cur;
                        l1 = tmp;
                        break;
                    }
                }
            }
            tmp = a;
        }
        return l1;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);


        mergeTwoLists(l1, l2);
    }
}
