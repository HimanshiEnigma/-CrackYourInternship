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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)return head;
        ListNode newn =new ListNode(head.val); 
        ListNode res=newn; 
        ListNode curr=head;
        while(curr!=null)
        {
            if(newn.val!=curr.val)
                newn.next=new ListNode(curr.val);
                newn=newn.next;
            }
            curr=curr.next;
        return res;
    }
}

