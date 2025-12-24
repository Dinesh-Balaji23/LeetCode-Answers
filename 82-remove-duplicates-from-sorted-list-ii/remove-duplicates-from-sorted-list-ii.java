class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode temp = head, prev = null;
        while(temp != null && temp.next != null) {
            if(temp.val == temp.next.val) {
                int x = temp.val;
                while(temp != null && temp.val == x) temp = temp.next;
                if(prev == null) head = temp;
                else prev.next = temp;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}