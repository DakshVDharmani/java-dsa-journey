//Optimal Solution 

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> mp = new HashMap<>(); 
        List<String> list = new ArrayList<>(); 

        String[] parts1 = s1.split(" "); 
        String[] parts2 = s2.split(" "); 
        //splitting takes O(N + M) time complexity with N and M words in s1 and s2 respectively. 

        for(int i = 0; i<parts1.length; i++){
            mp.put(parts1[i], mp.getOrDefault(parts1[i], 0) +1); 
            //performs HashMap lookup. 
        }

        for(int i = 0; i<parts2.length; i++){
            if(mp.containsKey(parts2[i])){
                mp.put(parts2[i], -1); 
                // marks the one repeated in both the strings. 
                continue; 
            }

            mp.put(parts2[i], mp.getOrDefault(parts2[i], 0) + 1); 
            //performs HashMap lookup. 
        }

        for(String keys: mp.keySet()){
            if(mp.get(keys)==1)
                list.add(keys); 
        }

        String[] ans = new String[list.size()]; 

        for(int i = 0; i<list.size(); i++){
            ans[i] = list.get(i); 
            //times time complexity O(A) <- where A is total unique characters caught in the list. A<<N, M. 
        }

        return ans; 
    }
}

//Time complexity = O(N+M) <-where N and M are total words in s1 and s2 respectively. Most time is taken during splitting. 
//Space complexity = O(N+M) 
