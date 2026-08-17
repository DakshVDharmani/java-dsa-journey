//Optimal Solution 

class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1; 

        while(left<right){
            int mid = left + (right-left)/2; 

            int num = nums[mid]; 

            if(num>nums[right])
                left = mid + 1; 

            else if(num<nums[right])
                right = mid; 
            
            else
                right--; 
        }

        return nums[left]; 
    }
}

//Time complexity = O(logN) <- worst case is still O(n) due to all duplicates 
//Space complexity = O(1)