//Optimal Solution 

import java.util.Scanner;

public class TwoSumII {
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

        int left = 0; 
        int right = curr-1; 

        while(left<right){

            int sum = nums[left]+nums[right]; 

            if(sum==target){
                left++; right++; 
                System.out.println("The indices are " + left + " and " + right); 
                break; 
            }     

            else if(sum<target)
                left++; 
            
            else 
                right--; 
        }

        System.out.println(""); 
    }
}
