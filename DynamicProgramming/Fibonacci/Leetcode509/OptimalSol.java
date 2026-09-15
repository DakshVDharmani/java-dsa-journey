//Optimal Solution 

import java.util.Scanner; 

public class OptimalSol {
    public static void main(String args[]){
        System.out.println("Enter the number"); 

        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 

        sc.close(); 

        if(n<=1){
            System.out.println("The fibonacci number is " + n); 
            return; 
        }

        int prev = 0, curr = 1; 

        for(int i = 2; i<=n; i++){
            int next = prev + curr; 

            prev = curr; 
            curr = next; 
        }

        System.out.println("The fibonacci number is " + curr); 
    }
}

//Time complexity = O(n)
//Space complexity = O(1)