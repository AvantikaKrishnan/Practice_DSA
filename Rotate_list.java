ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        int len = 1;

        if(head == null)
        return head;

        while(temp.next != null)
        {
            temp = temp.next;
            len++;
        }
        k= k%len;
        if(k ==0)
        return head;
        temp.next = head;
        

    ListNode head2 = head;


   for(int i =0;i<len-k-1;i++)
   {
       head2 = head2.next;
   }

    temp = head2.next;
    head2.next = null;

    return temp;
