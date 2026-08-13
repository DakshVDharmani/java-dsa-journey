//Space optimal solution 

class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr); 

        for(int i = 0; i<arr.length; i++){
            int target = 2*arr[i]; 

            int left = 0, right = arr.length-1; 

            while(left<=right){
                int mid = left + (right-left)/2; 

                if(arr[mid]==target&&mid!=i)
                    return true; 
                
                if(target>arr[mid])
                    left = mid+1; 
                else 
                    right = mid-1; 
            }
        }

        return false; 
    }
}

//Time complexity = O(nlogn) <-sorting takes the most time, and there's recurrent searching 
//Space complexity = O(1) <-no external data structure is utilized to store the array 