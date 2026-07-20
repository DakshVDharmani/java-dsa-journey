//Optimal Solution 

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int content = 0; 

        Arrays.sort(g); 
        Arrays.sort(s); 

        //Greedy only works after sorting both arrays. 

        int i = 0; 

        for(int j = 0; j<s.length; j++){

            if(i<g.length && s[j]>=g[i]){
                content++;
                i++;
            }
        }

        return content; 
    }
}

//Time complexity = O(nlogn) <-requires sorting of the two arrays. 
//Space complexity = O(1) <-none of the prominent data structures is used to store memory. 
