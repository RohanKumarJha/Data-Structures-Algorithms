class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp = null;
        ListNode pointer;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        while(list1!=null && list2!=null) {
            if(list1.val < list2.val) {
                pointer = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                pointer = new ListNode(list2.val);
                list2 = list2.next;
            }
            if(head == null) {
                head = pointer;
            } else {
                temp.next = pointer;
            }
            temp = pointer;
        }
        if(list1 == null) {
            temp.next = list2;
        }
        if(list2 == null) {
            temp.next = list1;
        }
        return head;
    }
}