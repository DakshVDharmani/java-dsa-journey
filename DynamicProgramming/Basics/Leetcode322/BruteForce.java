package DynamicProgramming.Basics.LeastEleSum;

public class OptimalSol {
    static public void main(String[] args){
        int[] arr = {7, 5, 1}; 
        int target = 18; 

        int ans = minCoin(target, arr); 
        System.out.println(ans); 
    }

    static int minCoin(int target, int[] arr){
        if(target==0)
            return 0; 

        int ans = Integer.MAX_VALUE; 

        for(int i = 0; i<arr.length; i++){
            if(target-arr[i]>=0){
                int subAns = minCoin(target -arr[i], arr); 
                ans = Math.min(subAns+1, ans); 
            }
        }

        return ans; 
    }
}
