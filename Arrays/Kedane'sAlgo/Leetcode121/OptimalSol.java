//Optimal Solution 

class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, maxProfit = 0; 

        for(int i : prices){
            buy = Math.min(buy, i); 
            maxProfit = Math.max(maxProfit, i-buy); 
        }

        return maxProfit; 
    }
}

//Time complexity = O(n) <-runs once through complete array
//Space complexity = O(1) <-no external data structure used to save the array
