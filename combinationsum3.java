class Solution {
      public List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<Integer> l = new ArrayList<>();
        helper(k,n,l,1);
        return list;

        
    }
    public void helper(int k ,int n, List<Integer> l,int j)
    {
        if(k == 0 && n == 0)
        {
            List<Integer> ans = new ArrayList<>(l);
            list.add(ans);
            return;
        }
        else if( (k <= 0 && n!=0) || (k!=0 && n <=0)|| k < 0 || n<0)
        return;
        else
        {
            for(int i = j;i<=9;i++)
            {
                l.add(i);
                k--;
                helper(k,n-i,l,i+1);
                k++;
                l.remove(l.size()-1);
            }
        }
    }
}
