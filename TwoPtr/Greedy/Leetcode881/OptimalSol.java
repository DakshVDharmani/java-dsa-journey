//Optimal Solution  

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int totalBoats = 0; 

        Arrays.sort(people); // <-sorting takes nlogn time complexity. 

        if(people.length<2)
            return people.length; 

        int left = 0, right = people.length-1; 
        
        while(left<=right){
            if(people[right]+people[left]<=limit)
                left++; 
            totalBoats++; 
            right--; 

        }

        return totalBoats; 
    }
}

//Time complexity = O(nlogn) <-nlogn for the sorting, and n for the iteration through the given array. 
//Space complexity = O(1)
