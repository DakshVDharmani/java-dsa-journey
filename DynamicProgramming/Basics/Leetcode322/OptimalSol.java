package DynamicProgramming.Basics.Leetcode322;

import java.util.Arrays; 

public class OptimalSol {
    public static void main(String[] args){
        int[] arr = {1, 2, 5}; 
        int target = 11; 

        int[] dp = new int[target+1]; 
        Arrays.fill(dp, -2); 

        dp[0] = 0; 

        int ans = minCoin(target, arr, dp); 
        System.out.println(ans); 
    }

    static int minCoin(int target, int[] arr, int[] dp){
        if(target == 0)
            return 0; 

        if(dp[target]!=-2)
            return dp[target]; 

        int ans = Integer.MAX_VALUE; 

        for(int i = 0; i<arr.length; i++){
            if(target-arr[i]>=0){
                int subAns = minCoin(target-arr[i], arr, dp); 

                if(subAns!=Integer.MAX_VALUE && subAns!=-1)
                    ans = Math.min(subAns+1, ans); 
            
            }
        }

        dp[target] = ans==Integer.MAX_VALUE? -1: ans; 

        return ans == Integer.MAX_VALUE? -1: ans; 
    }
}

//Time complexity = O(m*n) <-a massive increment comparing with the brute force solution 
//Space complexity = O(amount) <-still recursive stack calls overhead, due to top bottom approach
