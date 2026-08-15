//Optimal Solution 

class Solution {
    public int countLargestGroup(int n) {
        int[] freq = new int[37]; 

        for(int i = 1; i<=n; i++){
            int sum = 0; 
            int temp = i; 

            while(temp!=0){
                sum+=temp%10; 
                temp/=10; 
            }

            freq[sum]++; 
        }
        
        int[] totalCount = new int[37];  

        int maxCount = 0; 

        for(int i = 0; i<37; i++)
            maxCount = Math.max(freq[i], maxCount);
        
        int count = 0; 

        for(int i = 0; i<37; i++){
            if(freq[i]==maxCount)
                count++; 
        } 
        

        return count; 
    }
}

//Time complexity = O(n) <-circulates through 1-n, otherwise twice a 37-sized array
//Space complexity = O(1) <-only 37 sized array stores frequency 