//Brute Force solution 

import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hs.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }

        int[] result = new int[ans.size()];
        int index = 0;

        for (int num : ans) {
            result[index++] = num;
        }

        System.out.println("Intersection of the two arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

//Time Complexity: O(n + m)
//Space Complexity: O(n + k)
