//Optimal Solution 

package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String args[]){

                Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the array: ");

        ArrayList<Integer> nums = new ArrayList<>(); 

        while (true) {
            int x = sc.nextInt();

            if (x == -1)
                break;

            nums.add(x);
        }

        HashSet<Integer> hs = new HashSet<>();

        int maxSum = 0; 

        for(int i = 0; i<nums.size(); i++){
            hs.add(nums.get(i)); 
        } 

        for(int i : hs){
            if(!hs.contains(i-1)){
                int curr = i; 
                int sum = 1; 

                while(hs.contains(curr+1)){
                    sum++; 
                    curr++; 
                }

                maxSum = Math.max(maxSum, sum); 
            }
        }
        
        System.out.print("Total consecutive sum : " + maxSum); 
    }
}

//Time complexity = O(n)
//Space complexity = O(n)
