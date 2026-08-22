class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp= head;

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        while(list1!=null && list2!=null) {
            ListNode node;
            if(list1.val < list2.val) {
                node = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                node = new ListNode(list2.val);
                list2 = list2.next;
            }

            if(head == null) {
                head = node;
                temp = head;
            } else {
                temp.next = node;
                temp = temp.next;
            }
        }

        if(list1 != null) {
            temp.next = list1;
        }
        if(list2 != null) {
            temp.next = list2;
        }

        return head;
    }
}