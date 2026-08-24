//Optimal solution 

class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>(); 

        for(int i = 0; i<nums.size(); i++){
            int num = nums.get(i); 

            mp.computeIfAbsent(num,x-> new ArrayList<>()).add(i); 
        } 

        int maxLen = 1;       

        for(ArrayList<Integer> idx : mp.values()){
            int left = 0; 
            int temp = k; 

            for(int right = 0; right<idx.size(); right++){

                while(idx.get(right)-idx.get(left)-(right-left)>k){
                    left++; 
                }

                maxLen = Math.max(maxLen, right-left+1); 
            }
        } 

        return maxLen; 
    }
}

//Time complexity = O(n+N) <-distinct elements traversed through hashmap, and array to find freq 
//Space complexity = O(n) <-stores all distinct elements in hashmap, with indices in arraylist 