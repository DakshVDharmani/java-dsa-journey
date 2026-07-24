//Optimal Solution 

class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {

        int lastValid = -1;     // <- Last index where left <= nums[i] <= right 
        int lastInvalid = -1;   // <- Last index where nums[i] > right

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > right) {
                lastInvalid = i;
            }

            if (nums[i] >= left && nums[i] <= right) {
                lastValid = i;
            }

            ans += Math.max(0, lastValid - lastInvalid);
        }

        return ans;
    }
}

//Time complexity = O(n)
//Space complexity = O(1)
