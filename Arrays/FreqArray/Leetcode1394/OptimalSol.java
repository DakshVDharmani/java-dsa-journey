//Optimal solution 

class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501]; 

        for(int i = 0; i<arr.length; i++)
            freq[arr[i]]++; 

        int ans = -1; 
        
        for(int i = 1; i<freq.length; i++){
            if(i==freq[i])
                ans = Math.max(i, ans); 
        }

        return ans; 
    }
}

//Time complexity = O(N + 501) <-where n<500
//Space complexity = O(501) <-the frequency array 