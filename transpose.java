class Solution
{
    public void transpose(int n,int arr[][])
    {
        
        int r = arr.length;
        int c = arr[0].length;
        //System.out.println(r +" "+c);
        for( int i =0;i<r;i++)
        {
            for(int j = i+1;j<c;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        
    }
}
