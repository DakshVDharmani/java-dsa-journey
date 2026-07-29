//Optimal Solution 

class Solution {

    public boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'); 
    }
    

    public int maxVowels(String s, int k) {

        int left = 0; 

        int sum = 0, maxSum = 0; 

        for(int right = 0; right<s.length(); right++){

            if(isVowel(s.charAt(right)))
                sum++; 
            
            if(right-left+1>k){
                if(isVowel(s.charAt(left)))
                    sum--; 
                left++; 
            }
            
            if(right-left+1==k){
                maxSum = Math.max(maxSum, sum); 
            }
        }

        return maxSum;
    }
}

//Time complexity = O(n)
//Space complexity = O(1)
