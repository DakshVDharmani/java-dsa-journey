//Brute Force Solution 

import java.util.Scanner;

public class Fibonacci {
    public int calc(int n){
        if(n<=1)
            return n; 

        return calc(n-1)+calc(n-2); 
    }
    public static void main(String args[]) {

        System.out.print("Enter the number: "); 

        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt();

        int ans = calc(n);
        
        System.out.print(ans); 
         
    }
}

//Time complexity = O(2^n) <-creates multiple binary recursions 
//Space complexity = O(n)
