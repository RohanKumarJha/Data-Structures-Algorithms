class Solution {
    private int climb(int n,int[] dp) {
        if(n <= 2) {
            dp[n-1] = n;
            return dp[n-1];
        }
        if(dp[n-1] != 0) return dp[n-1];
        dp[n-1] = climb(n-1,dp) + climb(n-2,dp);
        return dp[n-1];
    }

    public int climbStairs(int n) {
        if(n <= 2) return n;
        int[] dp = new int[n+1];
        return climb(n,dp);
    }
}
