class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pichla=null, agla=null;
        ListNode abhiWala = head;

        while(abhiWala != null) {
            agla = abhiWala.next;
            abhiWala.next = pichla;
            pichla = abhiWala;
            abhiWala = agla;
        }

        return pichla;
    }
}
