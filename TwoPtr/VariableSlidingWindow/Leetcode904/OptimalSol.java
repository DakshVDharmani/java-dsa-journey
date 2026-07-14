//Optimal Solution <-also my brute force 

/*
This solution does not use HashMap, and utilizes the variable fruit availability. 
Right traces back, but still uses minimal time, right>left always. 
*/

class Solution {
    public int totalFruit(int[] fruits) {
        int maxAns = 0; 

        if(fruits.length==1)
            return 1; 

        int left = 0, right = 1; 
        while(right<fruits.length && fruits[left]==fruits[right])
            right++; 
        if(right == fruits.length)
            return fruits.length; 

        int first = fruits[left]; 
        int second = fruits[right]; 
        
        while(right<fruits.length){ 
            while((right<fruits.length)&&(fruits[right]==first||fruits[right]==second)){
                right++; 
            }
            
            maxAns = Math.max(right-left, maxAns); 

            if(right==fruits.length)
                break; 
            
            int keep = fruits[right-1]; 

            int temp = right; 
            while(right>left && fruits[right-1]==keep){
                right--; 
            }
            left = right; 
            right = temp; 
            

            first = fruits[left]; 
            second = fruits[right];       
        }

        return maxAns; 
    }
}

//Time complexity = O(n) 
//Space complexity = O(1) 
