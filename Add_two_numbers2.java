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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode list1 = reversal(l1);
        ListNode list2 = reversal(l2);

        ListNode ans = reversal(add(list1,list2));

        return ans;
        
    }



     public ListNode reversal(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = head;

        while(curr != null)
        {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return prev;
    }


     public ListNode add(ListNode l1,ListNode l2)
    {

        ListNode add = new ListNode(-1);
        ListNode ans = add;
        int sum = 0;
        int carry = 0;
        while(l1 != null && l2 != null)
        {
            sum = ((l1.val + l2.val)+carry)%10;
            carry = (l1.val + l2.val+carry)/10;
            ListNode new_node =new ListNode(sum);
            ans.next = new_node;
            ans = ans.next;

            l1 = l1.next;
            l2 = l2.next;

        }

        while (l1 !=null)
        {
            ListNode new_node;
            if(carry !=0)
            {
                 sum = ((l1.val)+carry)%10;
            carry = (l1.val + carry)/10;
            new_node =new ListNode(sum);
            
            }
            else
            {
                new_node =new ListNode(l1.val);

            }
           
            ans.next = new_node;
            ans = ans.next;
            l1 = l1.next;
        }
        while (l2 !=null)
        {
            ListNode new_node;
            if(carry !=0)
            {
               sum = ((l2.val)+carry)%10;
            carry = (l2.val + carry)/10;
            new_node =new ListNode(sum);
            }
            else
            {
                 new_node =new ListNode(l2.val);

            }
            ans.next = new_node;
            ans = ans.next;
            l2 = l2.next;
        }
        if(carry!=0)
        {
            ListNode new_node =new ListNode(carry);
            ans.next = new_node;
            ans = ans.next;
            carry=0;
        }
        return add.next;

    }

}
