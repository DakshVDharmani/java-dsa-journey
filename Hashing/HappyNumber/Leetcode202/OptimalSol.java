//Optimal Solution 

import java.util.HashSet; 
import java.util.Scanner; 

public class HappyNumber {
    public static void main(String[] args){
        System.out.println("Enter the number: "); 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        sc.close(); 
        HashSet<Integer> hs = new HashSet<>(); 
        while(n!=1){
            int sum = 0; 
            while(n>0){
                int digit = n%10; 
                sum+= digit * digit; 
                n /=10; 
            }
            n = sum; 
            if(hs.contains(n)){
                System.out.println("This is not a happy number.");
                return; 
            } 
            hs.add(n); 
        }
        System.out.println("This is a happy number!"); 
        return; 
    }
}

/*How did 810 outcomes come?
The maximum int that can be provided is 2,147,483,647. It has 10 digits. 
The worst number that can arise with all the squares and whatnot is 9,999,999,999. 
Maximum square of 9 = 81. Thus 10X81 = 810. 

*/

//Time complexity = O(1) <- iterations are bounded as well due to less than 810 outcomes. 
//Space complexity = O(1) <- as the size of available outcomes is bounded. 
