class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode temp = null;
        while(l1!=null || l2!=null || carry!=0) {
            int sum = 0;
            if(l1!=null && l2!=null) {
                sum = l1.val+l2.val+carry;
                l1 = l1.next;
                l2 = l2.next;
            } else if(l1 != null) {
                sum = l1.val+carry;
                l1 = l1.next;
            } else if(l2 != null) {
                sum = l2.val+carry;
                l2 = l2.next;
            } else {
                sum = carry;
            }
            int result = sum % 10;
            carry = sum/10;
            ListNode node = new ListNode(result);
            if(head == null) {
                head = node;
                temp = node;
            } else {
                temp.next = node;
                temp = temp.next;
            }
        }
        return head;
    }
}