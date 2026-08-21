//Optimal solution 

class Solution {
    public int minimumCardPickup(int[] cards) {
        HashSet<Integer> hs = new HashSet<>(); 

        int left = 0; 
        int pickedCards = 0; 
        int minPick = Integer.MAX_VALUE; 

        for(int right = 0; right<cards.length; right++){
            pickedCards++; 
            while(hs.contains(cards[right])){
                hs.remove(cards[left]); 
                left++; 
                pickedCards--; 
            }

            hs.add(cards[right]); 

            if(left>0 && cards[right]==cards[left-1])
                minPick = Math.min(minPick, pickedCards+1); 
        
        }

        return minPick == Integer.MAX_VALUE? -1: minPick; 
    }
}

//Time complexity = O(n)
//Space complexity = O(n) <-worst case the hashset might store all elements 