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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;
        ListNode dummyHead = new ListNode(0, head);
        ListNode prevGroupEnd = dummyHead;

        while(true) {
            ListNode kth = getKthNode(prevGroupEnd, k);
            if(kth == null) break;

            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kth.next;
            
            ListNode curr = groupStart;
            ListNode prev = nextGroupStart;
            while(curr != nextGroupStart) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            prevGroupEnd.next = kth;
            prevGroupEnd = groupStart;
        }
        return dummyHead.next;
    }

    private ListNode getKthNode(ListNode start, int k) {
        while(start != null && k>0) {
            start = start.next;
            k--;
        }
        return start;
    }
}