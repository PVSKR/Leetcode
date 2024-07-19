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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);

        for(int i=0; i<lists.length; i++) {
            if(lists[i] != null) pq.offer(lists[i]);
        }

        ListNode dummyHead = new ListNode();
        ListNode temp = dummyHead;

        while(!pq.isEmpty()) {
            ListNode node = pq.poll();
            temp.next = node;
            temp = temp.next;
            if(node.next != null) {
                pq.offer(node.next);
            }
        }

        return dummyHead.next;
    }
}