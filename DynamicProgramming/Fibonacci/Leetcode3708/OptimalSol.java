//Optimal Solution 

import java.util.Scanner; 

public class OptimalSol {
    public static void main(String args[]){
        System.out.println("Enter the array"); 

        Scanner sc = new Scanner(System.in); 

        int x = sc.nextInt(); 
        int curr = 0; 

        int[] arr = new int[100]; 

        while(x!=-1&&curr<100){
            arr[curr] = x; 
            x = sc.nextInt(); 
            curr++; 
        }

        sc.close();
        
        int count = 2, maxCount = 2; 
        
        for(int i = 2; i<curr; i++){
            if(arr[i]==arr[i-1]+arr[i-2])
                count++; 

            else   
                count = 2; 

            maxCount = Math.max(maxCount, count); 
        }

        System.out.println("The longest fibonacci subarray is of " + maxCount + " size"); 
    }
}

//Time complexity = O(n)
//Space complexity = O(1)
