package DynamicProgramming.Memoization.Leetcode518;

public class BruteForce {
    public static void main(String[] args){
        int[] arr = {1, 2, 5}; 
        int target = 5; 

        int ans = getAns(target, arr, 0); 

        System.out.println(ans); 

    }

    static int getAns(int target, int[] arr, int start){
        if(target == 0)
            return 1;  

        int ans = 0; 

        for(int i = start; i<arr.length; i++){
            if(target-arr[i]>=0)
                ans = getAns(target-arr[i], arr, i); 
        }

        return ans; 
    }
}

//Time complexity = exponential, roughly O(n^A) in the worst case, where A = amount and n = number of coins
//Space complexity = O(A) recursion stack in the worst case, when coin 1 exists