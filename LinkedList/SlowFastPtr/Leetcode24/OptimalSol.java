//Optimal Solution 

class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode first = head;
        ListNode second = head.next;

        // New head after first swap
        head = second;

        while (true) {

            ListNode temp = second.next;

            // Swap
            second.next = first;

            // If there is no next pair
            if (temp == null) {
                first.next = null;
                break;
            }

            // If only one node remains
            if (temp.next == null) {
                first.next = temp;
                break;
            }

            // Connect first node to next pair
            first.next = temp.next;

            // Move to next pair
            first = temp;
            second = temp.next;
        }

        return head;
    }
}

//Time complexity = O(n)
//Space complexity = O(1)