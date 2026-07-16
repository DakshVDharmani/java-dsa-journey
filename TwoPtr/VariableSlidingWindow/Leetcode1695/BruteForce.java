//Brute Force solution <-using HashSet instead of HashMap. 

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> hs = new HashSet<>(); 

        int left = 0; 
        int sum = 0, maxSum = 0; 

        for(int right = 0; right<nums.length; right++){
            while(hs.contains(nums[right])){
                hs.remove(nums[left]); 
                sum-= nums[left]; 
                left++; 
            }

            hs.add(nums[right]); 
            sum+=nums[right]; 

            maxSum = Math.max(maxSum, sum); 
        }

        return maxSum; 
    }
}

//Time complexity = O(n) <-traverses through the entire array once. 
//Space complexity = O(n) <-all the elements are once inserted.  
