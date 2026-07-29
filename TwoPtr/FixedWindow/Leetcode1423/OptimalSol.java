//Optimal Solution 

class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length; 
        //find the fixed n-k sized window with minimum sum

        int minSum = Integer.MAX_VALUE; 

        int left = 0;
        int totalSum = 0; 

        int sum = 0;  
        for(int right = 0; right<n; right++){ 

            sum+=cardPoints[right]; 

            if(right-left+1>n-k){
                sum-=cardPoints[left]; 
                left++; 
            }

            if(right-left+1==n-k){
                    minSum = Math.min(minSum, sum); 
            } 

            totalSum += cardPoints[right];             
        }

        if(k==n)
            return totalSum; 
        //handles the test case

        return totalSum-minSum; 
    }
}

//Time complexity = O(n) <-traverses the array just once
//Space complexity = O(1) <-uses multiple variables, not yet a data structure. 
