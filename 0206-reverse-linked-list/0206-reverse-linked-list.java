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
        // if(head == null) return null;
        // ListNode current = head;
        // ListNode prev = null;
        // ListNode front = null;

        // while(current != null) {
        //     front = current.next;
        //     current.next = prev;
        //     prev = current;
        //     current = front;
        // }
        // return prev; 

        return rev(head, null);
    }

    public ListNode rev(ListNode node, ListNode prev) {
        if(node == null) return prev;
        ListNode temp = node.next;
        node.next = prev;
        return rev(temp, node);
    } 
}