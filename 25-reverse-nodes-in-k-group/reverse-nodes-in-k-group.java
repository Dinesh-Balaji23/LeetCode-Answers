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
        ListNode dummy = new ListNode(0); // sentinel
        dummy.next = head;
        ListNode prev = dummy;
        while (true) {
            ListNode end = prev;
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) break;
            ListNode start = prev.next;
            ListNode next = end.next;
            ListNode curr = start;
            ListNode prevNode = next;
            while (curr != next) {
                ListNode temp = curr.next;
                curr.next = prevNode;
                prevNode = curr;
                curr = temp;
            }
            prev.next = prevNode;
            prev = start;
        }
        return dummy.next;
    }
}