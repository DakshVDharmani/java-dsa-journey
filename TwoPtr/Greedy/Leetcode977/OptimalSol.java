//Optimal Solution 

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length; 
        int left = 0, right = n-1;
        int index = n-1;  

        int[] ans = new int[n]; 

        while(left<=right){
            int ls = nums[left]*nums[left]; 
            int rs = nums[right]*nums[right]; 

            if(ls<rs){
                ans[index] = rs; 
                right--; 
            }
            else{
                ans[index] = ls; 
                left++; 
            }
            index--; 
        }

        return ans; 
    }
}

//Time complexity = O(n)
//Space complexity = O(n)