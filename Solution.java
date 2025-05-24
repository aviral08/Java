/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
        return false;
        ListNode t=head;
        ListNode fp=head;
        while(fp!=null && fp.next!=null)
        {
            t=t.next;
            fp=fp.next.next;
            if(fp==t)
            return true;
           
        }
        return false;
    }
}