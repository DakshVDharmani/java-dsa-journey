//Optimal Solution 

class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26]; 

        for(int i = 0; i<s.length(); i++)
            freq[s.charAt(i)-'a']++; 

        boolean[] present = new boolean[26];  
        StringBuilder ans = new StringBuilder(); 

        for(int i = 0; i<s.length(); i++){
            if(present[s.charAt(i)-'a']){
                freq[s.charAt(i)-'a']--; 
                continue; 
            }

            while(ans.length()>0 &&(present[s.charAt(i)-'a']==false)&&ans.charAt(ans.length()-1)>s.charAt(i)&&(freq[ans.charAt(ans.length()-1)-'a']>0)){
                present[ans.charAt(ans.length()-1)-'a'] = false;  
                ans.deleteCharAt(ans.length()-1); 
            }

            ans.append(s.charAt(i)); 
            present[s.charAt(i)-'a'] = true;   
            freq[s.charAt(i)-'a']--; 
        }

        return ans.toString(); 
    }
}

//Time complexity = O(2*n) <-goes through the given array twice  
//Space complexity = O(1) <-only 26 characters are stored in boolean and freq arrays