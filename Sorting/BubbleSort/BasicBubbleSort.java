package Sorting.BubbleSort;

import java.util.Arrays;
import java.util.Scanner; 

public class BasicBubbleSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the numbers to sort (enter -1 to stop): "); 

        int[] arr = new int[100]; 
        int idx = 0; 
        
        // Read input safely up to 100 elements
        while (sc.hasNextInt()) {
            int x = sc.nextInt(); 
            if (x == -1 || idx >= 100) break;
            arr[idx] = x; 
            idx++; 
        }
        sc.close(); 

        // True Bubble Sort: Compare adjacent elements (j and j+1)
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                } 
            }
        }

        // Print readable output
        System.out.print("Sorted Array: ");
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
