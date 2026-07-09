//Brute Force solution 

class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> mp1 = new HashMap<>();
        HashMap<String, Integer> mp2 = new HashMap<>();  

        int total=0; 

        for(int i = 0; i<words1.length; i++)
            mp1.put(words1[i], mp1.getOrDefault(words1[i], 0) + 1);

        for(int i = 0; i<words2.length; i++)
            mp2.put(words2[i], mp2.getOrDefault(words2[i], 0) + 1); 
        
        for(String key: mp1.keySet()){
            if(mp1.get(key)==1&&mp2.getOrDefault(key, 0)==1)
                total++; 
        }

        return total; 
    }
}

//Space complexity = O(N + M) <- where N and M are total unique elements in word1, and word2. 
//Time complexity = O(N + M + K) <- where N is the total number of elements in word1, M is total number of elements in word2, and K is total unique elements.
