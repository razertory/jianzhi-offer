package jianzhioffer.findfirstcommonnode;

/**
 * 输入两个链表，找出它们的第一个公共结点。
 * https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null ) return null;
        ListNode node1 = pHead1, node2 = pHead2;
        int len1 = 0, len2 = 0;

        for (; node1 !=null; node1 = node1.next, len1++);
        for (; node2 !=null; node2 = node2.next, len2++);

        int delta = len1 - len2;

        node1 = pHead1; node2 = pHead2;
        while (delta > 0) {
            node1 = node1.next;
            delta--;
        }
        while (delta < 0) {
            node2 = node2.next;
            delta++;
        }
        while (node1 != node2) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }
}
