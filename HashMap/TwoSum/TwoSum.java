//Optimal Solution 

import java.util.HashMap; 
import java.util.Scanner; 

public class TwoSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the array: ");
        int curr = 0; 
        int nums[] = new int[100]; 

        while (true) {
            int x = sc.nextInt();

            if (x == -1)
                break;

            nums[curr++] = x;
        }

        System.out.println("Enter the target sum: "); 
        int target = sc.nextInt(); 

        sc.close(); 

        HashMap<Integer, Integer> mp = new HashMap<>(); 

        for(int i = 0; i< curr; i++) {
            int compliment = target - nums[i]; 

            if(mp.containsKey(compliment)){
                System.out.println("The indices are: " + mp.get(compliment) + " and " + i); 
                break; 

            }

            mp.put(nums[i], i); 
        }

        System.out.println("");

    } 

}

//Time complexity = O(n)
//Space complexity = O(n)
