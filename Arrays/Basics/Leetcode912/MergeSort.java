//Merge Sort 

class Solution {
    public void mergeSort(int[] nums, int start, int end){        
        if(start<end){
            int mid = start + (end-start)/2; 

            mergeSort(nums, start, mid); 
            //for the left half 
            mergeSort(nums, mid+1, end); 
            //for the right half

            int[] temp = new int[nums.length]; 
            int idx = 0; 

            int i = start, j = mid+1; 

            while(i<=mid&&j<=end){
                if(nums[i]<=nums[j]){
                    temp[idx++] = nums[i]; 
                    i++; 
                }
                else{
                    temp[idx++] = nums[j]; 
                    j++; 
                }
            }

            while(i<=mid)
                temp[idx++] = nums[i++]; 
            
            while(j<=end)
                temp[idx++] = nums[j++]; 

            for(int k = 0; k<idx; k++){
                nums[start+k] = temp[k]; 
            }
            
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1); 
        return nums; 
    }
}

//Time complexity = O(nlogn)
//Space comexplty = o(n)