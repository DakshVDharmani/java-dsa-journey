//Optimal Solution 

class Solution {
    public boolean canJump(int[] nums) {
        int zeroDistance = 0; 
        //calculates the zero wall, and whether it can be climbed 
        boolean foundZero = false; 

        for(int i = nums.length-2; i>=0; i--){
            if(nums[i]==0 && !foundZero)
                foundZero = true; 
            
            if(foundZero&&nums[i] <= zeroDistance)
                zeroDistance++; 

            else if(foundZero && nums[i] > zeroDistance){
                zeroDistance = 0; 
                foundZero = false; 
            }
        }

        return zeroDistance==0; 
    }
}

//Time complexity = O(n)
//Space complexity = O(1)