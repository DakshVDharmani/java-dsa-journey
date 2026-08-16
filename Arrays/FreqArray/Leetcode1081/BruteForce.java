//Brute Force solution 

class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26]; 

        for(int i = 0; i<s.length(); i++)
            freq[s.charAt(i)-'a']++; 

        Stack<Character> st = new Stack<>();
        boolean[] present = new boolean[26];         
        for(int i = 0; i<s.length(); i++){
            while(!st.isEmpty()&&(present[s.charAt(i)-'a']==false)&&(int)st.peek()>(int)s.charAt(i)&&(freq[st.peek()-'a']>0)){
                present[st.peek()-'a'] = false;  
                st.pop(); 
            }

            if(st.isEmpty()||(int)st.peek()<(int)s.charAt(i)||((int)st.peek()>(int)s.charAt(i)&&(freq[st.peek()-'a']==0))){
                if(present[s.charAt(i)-'a']==true)
                    continue; 
                st.push(s.charAt(i)); 
                present[s.charAt(i)-'a']=true;  
            }
            
            freq[s.charAt(i)-'a']--; 
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : st) {
            ans.append(ch);
        }

        return ans.toString(); 
    }
}

//Time complexity = O(n) <-extra loops, and more lookups 
//Space complexity = O(1) <-yet extra space utilised due to monotonic stack 