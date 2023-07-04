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
    public ListNode deleteMiddle(ListNode head) {

         int  p = length(head);
         if(p==1)
         {
             return null;

         }
          return DeleteMidNode(head,p);
        
    }

    public int length(ListNode head)
        {
            ListNode temp = head;
            int count= 0;
            while(temp.next != null)
            {
                temp = temp.next;
                count++;

            }
            return count+1;
           
        }
        public ListNode DeleteMidNode(ListNode head,int c)
        {
            ListNode temp = head;
            int p=0;
            while(p+1 != c/2)
            {
                temp = temp.next;
                p++;
            }
            temp.next = temp.next.next;
            return head;
         
        }
}
