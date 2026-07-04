//Optimal Solution 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner; 

public class ContainsDuplicateII {
    public static void main(String args[]){

        System.out.println("Enter the array"); 
        Scanner sc = new Scanner(System.in); 

        ArrayList<Integer> array = new ArrayList<>(); 

        while(true){
            int x = sc.nextInt(); 

            if(x==-1)
                break; 

            array.add(x); 
        }

        System.out.println("Enter the value of k"); 

        int k = sc.nextInt(); 

        sc.close(); 

        HashMap<Integer, Integer> mp = new HashMap<>(); 

        for(int i = 0; i<array.size(); i++){ O
            if(mp.containsKey(array.get(i))){
                //solves a little like two sum without the compliment condition. 
                if((i - mp.get(array.get(i))) <= k)
                    System.out.println("Yes, there exists a duplicate under the given range.");  
            }
            mp.put(array.get(i), i); 
        }
    }
}

//Time complexity = O(n)
//Space complexity = O(n) <- arises from the ArrayList and the HashMap (O(n) each)
