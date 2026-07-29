//Optimal Solution 

class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int left = 0; 

        int[] freq = new int[101]; 
        int[] ans = new int[nums.length-k+1]; 

        for(int right = 0; right<nums.length; right++){
            freq[nums[right]+50] = freq[nums[right]+50] + 1; 
            //creates frequency buckets for presence

            if(right-left+1>k){
                //creating a fixed sliding window
                freq[nums[left]+50] = freq[nums[left]+50] - 1; 
                left++; 
            }

            if(right-left+1==k){
                int count = 0; 

                for(int i = 0; i<freq.length; i++){

                    count+=freq[i]; 
                    if(count>=x){
                        ans[left] = Math.min(i-50, 0); 
                        //only negative numbers are beauty
                        break; 
                    }
                }
            }
        }

        return ans; 
    }
}

//Time complexity = O(n + 101) <-traverses through the given array and the -50 to 50 sequence
//Space complexity = O(1) <-101 stored in the freq array. 
