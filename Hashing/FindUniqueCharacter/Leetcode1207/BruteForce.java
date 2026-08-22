//Brute Force solution 

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>(); 

        for(int i = 0; i<arr.length; i++)
            mp.put(arr[i], mp.getOrDefault(arr[i], 0)+1); 

        HashSet<Integer> hs = new HashSet<>(); 

        for(int key: mp.keySet()){
            if(hs.contains(mp.get(key)))
                return false; 
            
            hs.add(mp.get(key)); 
        }

        return true; 
    }
}

//Time complexity = O(N+M) <-where n is total arr elements and m is total unique elements
//Space complexity = O(n) 