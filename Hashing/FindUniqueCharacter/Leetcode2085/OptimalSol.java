//Optimal solution <- space complexity 

class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> mp = new HashMap<>(); 
        //uses only a single hashmap. 

        int total=0; 

        for(int i = 0; i<words1.length; i++)
            mp.put(words1[i], mp.getOrDefault(words1[i], 0) + 1);

        for(int i = 0; i<words2.length; i++){
            int existing = mp.getOrDefault(words2[i], 0); 
            //checking for existing first makes it clear that it comes from words1. 

            if (mp.containsKey(words2[i])&&existing<2)
            //checking for existing to be less than 2 makes sure ambiguity doesn't arrive. 
                mp.put(words2[i], existing -1);
        } 
        
        for(String key: mp.keySet()){
            if(mp.get(key)==0)
                total++; 
        }

        return total; 
    }
}

//Time complexity = O(N + M + K) <- where N, M and K are total characters of words1, words2, and unqiue characters in words1 respectively. 
//Space complexity = O(k) <- only the unique elements of words1 are stored. 
