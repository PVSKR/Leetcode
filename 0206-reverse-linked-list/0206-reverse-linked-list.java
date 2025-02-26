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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode current = head;
        ListNode front = null;
        ListNode prev = null;

        while(current != null) {
            front = current.next;
            current.next = prev;
            prev = current;
            current = front;
        }
        return prev;
        // return reverse(head, null);
    }

    // private ListNode reverse(ListNode current, ListNode prev) {
    //     if(current == null) return prev;
    //     ListNode temp = current.next;
    //     current.next = prev;
    //     return reverse(temp, current);
    // }
}