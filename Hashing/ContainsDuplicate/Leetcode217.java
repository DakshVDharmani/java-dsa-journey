//Optimal Solution 

package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner; 

public class ContainsDuplicate {
    public static void main(String args[]){
        System.out.println("Enter the array: "); 
        Scanner sc = new Scanner(System.in); 

        ArrayList<Integer> array = new ArrayList<>(); 

        while (true) {
            int x = sc.nextInt();

            if (x == -1)
                break;

            array.add(x); 
        }


        sc.close(); 

        HashSet<Integer> hs = new HashSet<>(); 

        for(int i = 0; i<array.size(); i++){

            if(hs.contains(array.get(i)))
                System.out.println("The array contains duplicates."); 
        
            hs.add(array.get(i)); 
        }
    }
}

//Time complexity = O(n)
//Space complexity = O(n) <-worst case. 
