//Optimal solution 

class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length-1; 

        while(left<right){
            int mid = left + (right-left)/2; 

            //upward graph 
            if(nums[mid]<nums[mid+1]){
                left = mid+1; 
            }

            //downward graph 
            else if(nums[mid]>nums[mid+1]){
                right = mid; 
            }

            /*
            Right is not mid-1 as mid might actually be the peak 
            eliminating mid might delete the peak as well 
            */
        }

        return left; 
    }
}

//Time complexity = O(logN) <-utilises binary search 
//Space complexity = O(1) <-no separate data structure is used 