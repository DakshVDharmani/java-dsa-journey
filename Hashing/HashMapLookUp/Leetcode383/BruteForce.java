//Brute Force solution 

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mp = new HashMap<>(); 
        for(int i = 0; i<magazine.length(); i++){
            mp.put(magazine.charAt(i), mp.getOrDefault(magazine.charAt(i), 0) + 1); 
        }

        for(int i = 0; i<ransomNote.length(); i++){
            if(mp.containsKey(ransomNote.charAt(i))){
                if(mp.get(ransomNote.charAt(i))>=1)
                    mp.put(ransomNote.charAt(i), mp.get(ransomNote.charAt(i)) - 1); 
                else
                    return false; 
            }
            else
                return false; 
        }

        return true; 
    }
}

//Time complexity = O(M + N) <-where M and N are total items in magazine and ransonNote respectively. This is based on the worst case. 
//Space complexity = O(k) <- where k are total distinct characters. 
