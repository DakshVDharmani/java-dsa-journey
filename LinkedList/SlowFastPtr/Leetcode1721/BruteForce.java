//Brute Force solution 

class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode fast = head;
        int n = 0;

        // Find length
        while (fast != null) {
            n++;
            fast = fast.next;
        }

        // Position of kth node from beginning
        int x = n - k + 1;

        ListNode temp = head;
        ListNode slow = head;

        int small = 0;
        int large = 0;

        for (int i = 1; i <= n; i++) {

            // kth node from beginning
            if (i == k) {
                small = temp.val;
            }

            // kth node from end
            if (i == x) {
                large = temp.val;
            }

            temp = temp.next;
        }

        // Now find the two nodes again
        temp = head;

        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }

        slow = head;

        for (int i = 1; i < x; i++) {
            slow = slow.next;
        }

        // Swap values
        temp.val = large;
        slow.val = small;

        return head;
    }
}

//Time complexity = O(n) + O(k) + O(n-k) <-too many iterations waste time 
//Space complexity = O(1)