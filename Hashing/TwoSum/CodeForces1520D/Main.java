import java.util.*; 

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        int testCases = sc.nextInt(); 

        for(int i = 0; i<testCases; i++){
            int inputSize = sc.nextInt(); 
            HashMap<Long, Long> mp = new HashMap<>(); 
            long ans = 0; 

            for(int j = 0; j<inputSize; j++){
                long val = sc.nextLong(); 

                long key = val - j;
                //subtract current index 

                ans+= mp.getOrDefault(key, 0L); 

                mp.put(key, mp.getOrDefault(key, 0L)+1); 
            } 

            System.out.print(ans);             
        }
    }
}

//Time complexity = O(n)
//Space complexity = O(n) <-saves the elements of each array inside the hashmap