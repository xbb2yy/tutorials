package leetcode;

import leetcode.common.Pass;

import java.util.ArrayList;
import java.util.Objects;

@Pass
public class Q0023_MergekSortedLists {

    public static ListNode mergeKLists(ListNode[] lists) {

        if (Objects.isNull(lists) || lists.length == 0) {
            return null;
        }
        ArrayList<ListNode> list = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                list.add(lists[i]);
            }
        }
        ListNode n = null, prev = null;
        while (list.size() != 0) {
            int min = list.get(0).val;
            ListNode tmp = list.get(0);
            for (ListNode node : list) {
                if (node.val < min) {
                    tmp = node;
                    min = node.val;
                }
            }

            if (n == null) {
                list.remove(tmp);
                if (tmp.next != null) {
                    list.add(tmp.next);
                }
                n = tmp;
                prev = n;
                tmp.next = null;
            } else {
                list.remove(tmp);
                if (tmp.next != null) {
                    list.add(tmp.next);
                }
                prev.next = tmp;
                prev = tmp;
                tmp.next = null;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        ListNode l7 = new ListNode(2);
        ListNode l8 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;

        l4.next = l5;
        l5.next = l6;

        l7.next = l8;

        ListNode[] l = {null, null};
        mergeKLists(l);
    }
}
