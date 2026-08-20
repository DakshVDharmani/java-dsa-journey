//Optimal solution 

class Solution {
    int[] dp; 
    //initialize outside to access 

    int climbing(int n){
        if(n<=1)
            return 1; 
        
        if(dp[n]!=-1)
            return dp[n]; 
        
        dp[n] = climbing(n-1) + climbing(n-2); 

        return dp[n]; 
    }

    public int climbStairs(int n) {
        dp = new int[n+1]; 
        //declare the size inside, updates everywhere 
        Arrays.fill(dp, -1); 

        return climbing(n); 
    }
}

//Time complexity = O(n)
//Space complexity = O(n)