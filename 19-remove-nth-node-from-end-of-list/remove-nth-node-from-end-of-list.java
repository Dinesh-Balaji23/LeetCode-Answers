class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head, slow = head, fast = head;
        if(head.next == null) return null;
        while(--n > 0) fast = fast.next;
        while(fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        if(slow == head) return head.next;
        if(prev != null) prev.next = slow.next;
        return head;
    }
}