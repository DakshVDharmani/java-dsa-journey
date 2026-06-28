//Brute Force solution 

class Solution {
    public int longestContinuousSubstring(String s) {

        if(s.length() == 0) return 0; //make sure to use the empty string

        int maxSum = 1; 

        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i+1) == s.charAt(i) + 1){
                int curr = i; 
                int sum = 1; 
                while(curr + 1 < s.length() && s.charAt(curr+1) == s.charAt(curr) + 1){
                    sum++; 
                    curr++;
                }
                            
                maxSum = Math.max(maxSum, sum); 
            }
        }
        return maxSum; 
    }
}

//Time complexity = O(n<sup>2</sup>) 
//Space complexity = O(1)
