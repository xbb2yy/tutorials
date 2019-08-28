package leetcode;

import leetcode.common.Pass;

import java.math.BigInteger;

@Pass
public class Q0002_AddTwoNumbers {

    /**
     * 暴力解法
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder s1 = new StringBuilder();
        ListNode tmp = l1;
        while (tmp != null) {
            s1.append(tmp.val);
            tmp = tmp.next;
        }

        StringBuilder s2 = new StringBuilder();
        ListNode tmp1 = l2;
        while (tmp1 != null) {
            s2.append(tmp1.val);
            tmp1 = tmp1.next;
        }

        /**
         * 需要用BigInteger，否则数字太大会出现问题
         */
        BigInteger i = new BigInteger(s1.reverse().toString()).add(new BigInteger(s2.reverse().toString()));
        StringBuilder reverse = new StringBuilder(i.toString()).reverse();

        ListNode head = null;
        ListNode prev = null;
        for (int j = 0; j < reverse.length(); j++) {
            if (head == null) {
                head = new ListNode(Integer.parseInt(reverse.charAt(j) + ""));
                prev = head;
                continue;
            }
            ListNode t = new ListNode(Integer.parseInt(reverse.charAt(j) + ""));
            prev.next = t;
            prev = t;

        }
        return head;
    }

    public static ListNode solution(ListNode l1, ListNode l2) {

        int c = 0;
        ListNode n = null, prev = null;
        ListNode t = l1;
        ListNode k = l2;
        while (t != null || k != null) {
            if (t == null) {
                t = new ListNode(0);
            }
            if (k == null) {
                k = new ListNode(0);
            }
            int l = (t.val + k.val + c) % 10;
            c = (t.val + k.val + c) / 10;
            ListNode node = new ListNode(l);
            if (n == null) {
                n = node;
                prev = n;
            } else {
                prev.next = node;
                prev = node;
            }
            t = t.next;
            k = k.next;
        }
        if (c != 0) {
            ListNode node = new ListNode(c);
            prev.next = node;
        }
        return n;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(8);
        ListNode n3 = new ListNode(5);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(4);
        //  n1.next = n2;

        solution(n1, n3);

    }
}
