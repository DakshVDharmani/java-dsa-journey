//Optimal Solution 

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=0, maxSum=Integer.MIN_VALUE; 
        for (int i = 0; i<nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]); 
            maxSum = Math.max(currentSum, maxSum); 
        }
        return maxSum; 
    }
}

//Time complexity = O(n)
//Space complexity = O(1) <-no external data structure is used to story memory
