class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        int j = 0;
        int i =0;
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> q = new LinkedList<Integer>();
 
        int max = 0;
        for(i= 0;i<k;i++)
        {
            while(!q.isEmpty() && arr[i]>arr[q.peekLast()] )
            q.removeLast();
            
            q.addLast(i);
            
        }
        ans.add(arr[q.peek()]);
      
        for( ;i<n;i++)
        {
            while(!q.isEmpty() && q.peek()<=i-k)
            q.removeFirst();
            
            while(!q.isEmpty() && arr[q.peekLast()]<=arr[i])
            {
            q.removeLast();
           
            }
            
            q.addLast(i);

            ans.add(arr[q.peek()]);
        }
        
        return ans;
    }
}
