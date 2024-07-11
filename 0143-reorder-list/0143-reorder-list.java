/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfStart = slow.next;
        ListNode prev = slow.next = null;
        while(secondHalfStart != null) {
            ListNode temp = secondHalfStart.next;
            secondHalfStart.next = prev;
            prev = secondHalfStart;
            secondHalfStart = temp;
        } 

        ListNode first = head;
        secondHalfStart = prev;
        while(secondHalfStart != null) {
            ListNode t1 = first.next;
            ListNode t2 = secondHalfStart.next;
            first.next = secondHalfStart;
            secondHalfStart.next = t1;
            first = t1;
            secondHalfStart = t2;
        }
    }
}