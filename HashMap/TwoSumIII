//Optimal Solution 

import java.util.HashMap; 
import java.util.Scanner; 
import java.util.ArrayList; 

public class TwoSumIII {
    public static Scanner sc = new Scanner(System.in); 

    public static void main(String args[]){
        
        ArrayList<Integer> array = new ArrayList<>(); 

        while(true){
            System.out.println("Which operation would you like to perform?"); 
            System.out.println("1. Add to Array \n2. Find TwoSum\n-1. Exit"); 

            int choice = sc.nextInt(); 
            if(choice == -1)
                break; 
            
            switch(choice){

                case 1: 
                    add(array); 
                    break; 

                case 2: 
                    find(array); 
                    break; 

                default:
                    System.out.println("Please choose a number between 1, 2 and -1"); 
            }
        }

        sc.close(); 

    }

    public static ArrayList<Integer> add(ArrayList<Integer> array){
        System.out.println("Enter the number you wish to add: "); 
        int num = sc.nextInt(); 
        array.add(num); 
        return array; 
    }

    //Time complexity = O(1); 

    public static boolean find(ArrayList<Integer> array){
        System.out.println("Enter the sum you wish to find: "); 
        int sum = sc.nextInt(); 

        HashMap<Integer, Integer> mp = new HashMap<>(); 

        for(int i = 0 ; i < array.size(); i++){
            int compliment = sum - array.get(i); 

            if(mp.containsKey(compliment))
              return true; 
            mp.put(array.get(i), i); 
        }
        return false; 
    }
    
    //Time complexity = O(n)
}
