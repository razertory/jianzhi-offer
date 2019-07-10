package jianzhioffer.entrynodeofloop;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null
 * https://www.nowcoder.com/practice/253d2c59ec3e4bc68da16833f79a38e4
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null || pHead.next == null) return null;
        ListNode slow = pHead, fast = pHead;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                slow = pHead;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
