public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA, temp2=headB;
        while(true) {
            if(temp1 == temp2) return temp1;
            if(temp1.next==null && temp2.next==null) return null;
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1 == null) temp1 = headB;
            if(temp2 == null) temp2 = headA;
        }
    }
}