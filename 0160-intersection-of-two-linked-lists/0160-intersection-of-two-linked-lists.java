public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0, len2=0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }
        while(temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }

        temp1 = headA;
        temp2 = headB;
        if(len1 < len2) {
            while(len1 != len2) {
                len2--;
                temp2 = temp2.next;
            }
        } else if(len1 > len2) {
            while(len1 != len2) {
                len1--;
                temp1 = temp1.next;
            }
        }

        while(temp1 != null) {
            if(temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;

    }
}