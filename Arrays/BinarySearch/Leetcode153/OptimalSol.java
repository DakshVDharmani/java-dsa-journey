//Optimal Solution 

class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1;

        while(left<right){
            int mid = left + (right-left)/2; 
            int num = nums[mid]; 

            if(num>nums[right])
                left = mid + 1; 

            else 
                right = mid; 
        }

        return nums[left]; 
    }
}

//Time complexity = O(logN) <-using binary search 
//Space complexity = O(1)