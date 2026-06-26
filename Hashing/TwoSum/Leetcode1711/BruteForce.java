//Brute Force

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class CountGoodMeals {

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

        Arrays.sort(nums); 

        int n = nums.length; 

        if(n<2)
            return 0; 
        
        int maxm = nums[n-1] + nums[n-2]; 
        ArrayList<Integer> list = pairs(maxm); 
        long sum = 0; 
        final int MOD = 1000000007;
        for(int i = 0; i<list.size(); i++){
            HashMap<Integer, Integer> mp = new HashMap<>(); 
            for(int j = 0; j<nums.length; j++){
                if(nums[j]>list.get(i))
                    break; 
                
                int compliment = list.get(i)-nums[j]; 

                if(mp.containsKey(compliment))
                    sum = (sum + mp.get(compliment)) % MOD;        
                            
                mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1); 
            }
        }

        return (int)sum; 
    }

    public ArrayList<Integer> pairs(int maxm){
        int num = 1; 
        ArrayList<Integer> list = new ArrayList<>(); 
        while(num<=maxm){
            list.add(num); 
            if(num>Integer.MAX_VALUE/2)
                break; 
            num*=2; 
        }
        return list; 
    }
}

//Time complexity = O(n log n + n log maxm)
//Space complexity = O(n)
