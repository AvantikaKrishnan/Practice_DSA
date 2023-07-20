class Solution {
    public int rob(int[] nums) {

        int dp [] = new int[nums.length];
        Arrays.fill(dp, -1);

        return helper(dp,nums, 0);
        
    }
    public int helper(int dp[] , int nums[] , int i)
    {
        if(i >= nums.length)
        return 0;

        if(dp[i]!= -1)
        return dp[i];

        int a = nums[i]+helper(dp,nums,i+2);
        int b = helper(dp,nums, i+1);

        dp[i] = Math.max(a,b);

        return dp[i];

    }
}
