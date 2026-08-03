//Optimal Solution 

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0; 

        for(int num: nums)
            ans^= num; //XOR the current number

        /*
        Properties of XOR - 
        XOR with any number except itself gives current number.
        With itself, it gives 0. 
        */
        
        return ans;
    }
}

//Time complexity = O(n) <-traverses the complete array
//Space complexity = O(1) <-there is no external data structure used to save information 
