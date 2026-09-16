import java.util.Arrays; 

class Solution {
    int[] dp; 

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1]; 

        Arrays.fill(dp, -2); 
        dp[0] = 0;

        return minCoin(amount, coins);
    }

    int minCoin(int target, int[] arr) {
        if (target == 0)
            return 0;

        if(dp[target]!=-2)
            return dp[target]; 

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (target - arr[i] >= 0) {
                int subAns = minCoin(target - arr[i], arr);

                if (subAns != -1) {
                    ans = Math.min(ans, subAns + 1);
                }
            }
        }

        dp[target] = (ans == Integer.MAX_VALUE) ? -1: ans;  

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

//Time complexity = O(A × n²)
//Space complexity = O(A × n) for DP table + O(A) recursion stack