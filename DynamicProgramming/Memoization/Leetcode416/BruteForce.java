class Solution {
    Boolean[][] dp; 

    public boolean canPartition(int[] nums) {
        int sum = 0; 
        for(int i = 0; i<nums.length; i++)
            sum+=nums[i]; 
        
        if(sum%2!=0)
            return false; 
        
        int target = sum/2; 
        dp = new Boolean[nums.length][target+1]; 

        return getAns(0, target, nums); 
    }

    boolean getAns(int index, int target, int[] arr){
        if(target==0)
            return true;

        if(index == arr.length)
            return false;  

        if(dp[index][target] != null)
            return dp[index][target]; 

        boolean notTake = getAns(index+1, target, arr); 
        //checks ahead

        boolean take = false; 

        if(target-arr[index]>=0)
            take = getAns(index+1, target-arr[index], arr); 

        dp[index][target] = take || notTake; 

        return dp[index][target]; 
    }
}

//Time complexity = O(targetxN)
//Space complexiy = O(target)