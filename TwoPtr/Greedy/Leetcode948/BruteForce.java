//Brute Force solution 

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        Arrays.sort(tokens); //takes most time

        int left = 0, right = tokens.length-1; 

        int maxScore = 0, score = 0; 

        while(left<=right){

            if(power>=tokens[left]){ //Face up 
                score++; 
                power-=tokens[left]; 
                left++; 
                maxScore = Math.max(maxScore, score); 
            }

            else if(score>0&&right>left){ //Face down
                score--; 
                power+=tokens[right]; 
                right--; 
            }

            else 
                break; 

        }

        return maxScore; 
    }
}

//Time complexity = O(nlogn) 
//Space complexity = O(1) 
