// Brute force solution 

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter array elements (-1 to stop):");

        while (true) {
            int x = sc.nextInt();
            if (x == -1)
                break;
            arr.add(x);
        }

        System.out.println("Enter k:");
        int k = sc.nextInt();

        sc.close();

        int[] nums = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr.get(i);
        }

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            int max = Collections.max(mp.values());

            int foundKey = 0;

            for (int key : mp.keySet()) {
                if (mp.get(key) == max) {
                    foundKey = key;
                    break;
                }
            }

            ans[i] = foundKey;
            mp.remove(foundKey);
        }

        System.out.println("Top " + k + " frequent elements are:");
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}

//Space complexity = O(n)
//Time complexity = O(n^2) <-worst case, if iteration of the map is needed multiple times. 
