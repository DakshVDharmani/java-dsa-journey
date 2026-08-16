//Brute Force solution 

class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> mp = new HashMap<>(); 

        for(int num = 1; num<=n; num++){
            int sum = 0; 
            int temp = num; 

            while(temp!=0){
                sum+=temp%10; 
                temp/=10; 
            }

            mp.put(sum, mp.getOrDefault(sum, 0) + 1); 
            //hashmap lookup utilises O(1) time
        }

        int max = Collections.max(mp.values());
        int count = 0;  

        for(int key: mp.keySet()){
            if(mp.get(key)==max)
                count++; 
        }

        return count; 
    }
}

//Time complexity = O(n) <-travels from 1 to n, and then through the hashmap to find max, and count
//Space complexity = O(n) <-HashMap creates overhead 