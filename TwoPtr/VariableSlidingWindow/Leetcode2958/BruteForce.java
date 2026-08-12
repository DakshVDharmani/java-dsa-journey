//Brute Force solution 

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>(); 
        int n = nums.length; 
        int left = 0; 

        int maxCount = 0, count = 0; 

        for(int right = 0; right<n; right++){
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1); 

            if(mp.get(nums[right])>k){
                while(mp.get(nums[right])!=k){
                    mp.put(nums[left], mp.get(nums[left])-1); 
                    left++; 
                    count--; 
                }
            }

            count++; 
            maxCount = Math.max(count, maxCount); 
        }

        return maxCount; 
    }
}

//Time complexity = O(n) <- on average, worst case more as left might move continously 
//Space complexity = O(n) <-as hashmap stores the array's unique elements with freq