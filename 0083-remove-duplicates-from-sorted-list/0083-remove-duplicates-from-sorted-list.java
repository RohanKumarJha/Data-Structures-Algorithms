class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode temp = head;
        ListNode pointer = head.next;
        while(pointer != null) {
            if(temp.val != pointer.val) {
                temp.next = pointer;
                temp = temp.next;
            }
            pointer = pointer.next;
        }
        temp.next = pointer;
        return head;
    }
}