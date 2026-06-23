//Optimal Solution

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class CountGoodMeals {

    public static void main(String args[]){

        //Brute force is to sort but utilizes nlogN time complexity. 

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the array: ");

        ArrayList<Integer> nums = new ArrayList<>(); 

        while (true) {
            int x = sc.nextInt();

            if (x == -1)
                break;

            nums.add(x);
        }

        int n = nums.size(); 

        if(n<2){
            System.out.println("The total delicious meals are 0"); 
            System.exit(0); 
        } 

        int maxVal = 0;

        for(int x : nums)
            maxVal = Math.max(maxVal, x);

        int maxm = 2 * maxVal;
        //using maxm in the loop limits iterations. 
        
        long sum = 0; 
        final int MOD = 1000000007;
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int x : nums){
            for(int power = 1; power <= maxm; power <<= 1){
            
                int complement = power - x;
                sum = (sum + mp.getOrDefault(complement, 0)) % MOD;
            }

            mp.put(x, mp.getOrDefault(x, 0) + 1); 
            //stores frequency rather than index 
        }
        System.out.println("The total number of delicious meals are :" + sum); 


        sc.close(); 

    } 
}

//Time complexity = O(n)
//Space complexity = O(n)
