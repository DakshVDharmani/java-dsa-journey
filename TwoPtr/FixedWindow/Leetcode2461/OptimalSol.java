//Optimal Solution 

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> hs = new HashSet<>(); 

        int left = 0; 

        long maxSum = 0, sum = 0; 

        for(int right = 0; right<nums.length; right++){
            sum+=nums[right]; 

            if(hs.contains(nums[right])){
                while(hs.contains(nums[right])&&left<nums.length){
                    sum-=nums[left]; 
                    hs.remove(nums[left]); 
                    left++; 
                }
            }

            if(right-left+1>k){
                sum-=nums[left]; 
                hs.remove(nums[left]); 
                left++; 
            }

            if(right-left+1==k)
                maxSum = Math.max(maxSum, sum); 

            hs.add(nums[right]); 
        }

        return maxSum; 
    }
}

//Time complexity = O(n)
//Space complexity = O(1)
