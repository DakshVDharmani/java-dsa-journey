//Optimal Solution 

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1; 

        while(left<=right){
            int mid = left + (right-left)/2; 

            int num = nums[mid]; 

            //now check if num and target are on the same side
            if((num<nums[0])==(target<nums[0]))
                num = nums[mid]; 
            else 
                num = target<nums[0]? Integer.MIN_VALUE : Integer.MAX_VALUE; 
                /*by putting the extreme values we force to search 
                the side of the target, attempting to change to 
                -INF or +INF
                */

            if(num<target)
                left = mid + 1; 
            else if(num>target)
                right = mid - 1; 
            else
                return mid; 
        }

        return -1; //not found; 
    }
}

//Time complexity = O(logN) <-using parted binary search 
//Space complexity = O(1) 