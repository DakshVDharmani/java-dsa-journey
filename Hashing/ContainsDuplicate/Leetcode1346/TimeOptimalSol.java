//Time optimized solution 

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hs = new HashSet<>(); 

        for(int i = 0; i<arr.length; i++){
            if (hs.contains(arr[i] * 2))
                return true;

            if (arr[i] % 2 == 0 && hs.contains(arr[i] / 2))
                return true;

            hs.add(arr[i]); 
        }

        return false;
    }
}

//Time complexity = O(n) <-worst case, might need to traverse the complete array 
//Space complexity = O(n) <-Hashset might store all array values 