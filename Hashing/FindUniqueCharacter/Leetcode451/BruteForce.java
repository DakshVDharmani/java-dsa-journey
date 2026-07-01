// Brute Force 

class Solution {

  //this solution offers good space complexity, but using buckets solves it faster. 
    public String frequencySort(String s) {
        HashMap<Character, Integer> mp = new HashMap<>(); 

        for(int i = 0; i<s.length(); i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+ 1); 
        }

        ArrayList<Character> arr = new ArrayList<>(); 
        
        StringBuilder sb = new StringBuilder();

        while(!mp.isEmpty()){
            int max = Collections.max(mp.values());

            for(char c : new ArrayList<>(mp.keySet())){
                if(mp.get(c) == max){
                    for(int i = 0; i < max; i++){
                        sb.append(c);
                    }
                    mp.remove(c);
                }
            }
        }
        return sb.toString();
    }
}
