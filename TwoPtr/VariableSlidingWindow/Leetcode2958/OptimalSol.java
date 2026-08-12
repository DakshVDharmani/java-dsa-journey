//Optimal Solution 

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>(); 
        int n = nums.length; 
        int left = 0; 

        int maxCount = 0; 

        for(int right = 0; right<n; right++){
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1); 

            while(mp.get(nums[right])>k){
                mp.put(nums[left], mp.get(nums[left])-1); 
                left++; 
            }

            maxCount = Math.max(right-left+1, maxCount); 
        }

        return maxCount; 
    }
}

//Time complexity = O(n) <-the refurbished version reduces if-else, and count alg. 
//Space complexity = O(n) <-slightly enhanced with less number of variables 