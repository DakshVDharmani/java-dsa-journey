//Optimal solution 

class Solution {
    public int minOperations(int[] nums, int x) {

        int total = 0;

        for (int num : nums) 
            total += num;

        int diff = total - x;
        int n = nums.length;

        if (diff < 0) 
            return -1;

        int left = 0;
        int sum = 0;
        int maxSubLen = -1;

        for (int right = 0; right < n; right++) {

            sum += nums[right];

            while (sum > diff) {
                sum -= nums[left];
                left++;
            }

            if (sum == diff) {
                maxSubLen = Math.max(
                    maxSubLen,
                    right - left + 1
                );
            }
        }

        // diff == 0 means remove all elements
        if (diff == 0) 
            return n;

        if (maxSubLen == -1) 
            return -1;

        return n - maxSubLen;
    }
}

//Time complexity = O(n)
//Space complexity = O(1)