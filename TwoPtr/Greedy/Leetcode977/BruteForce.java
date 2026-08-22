//Brute Force solution 

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i<nums.length; i++)
            nums[i] = nums[i]*nums[i]; 

        Arrays.sort(nums);   
        return nums; 
    }
}

//Time complexity = O(NlogN)
//Space complexity = O(1)