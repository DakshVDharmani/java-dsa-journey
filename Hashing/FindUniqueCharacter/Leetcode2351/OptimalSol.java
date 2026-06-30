//Optimal Solution 

import java.util.HashSet;
import java.util.Scanner; 

public class FirsttoAppearTwice {
    public static void main(String args[]) {

        System.out.println("Enter the string: "); 

        Scanner sc = new Scanner(System.in); 

        String s = sc.nextLine(); 

        HashSet<Character> hs = new HashSet<>(); 
    
        for(int i = 0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                System.out.println("The first character to repeat twice is " + s.charAt(i)); //return otherwise. 
                System.exit(0); 
            }
            
            hs.add(s.charAt(i)); . 
        }

        System.out.println("There is no character repetition."); 
    }
}

//Time complexity = O(n)
//Space complexity = O(n)
