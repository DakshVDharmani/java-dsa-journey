//Optimal Solution 

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, total = 0; 

        int left = 0; 

        for(int right = 0; right<arr.length; right++){
            sum+=arr[right]; 

            if(right-left+1>k){
                sum-=arr[left]; 
                left++; 
            }

            //avoiding unnecessary arithmetic 

            if(right-left+1==k&&sum>=k*threshold)
            //problems handling >=
                total++; 
            
        }

        return total; 
    }
}

//Time complexity = O(n)
//Space complexity = O(1)
