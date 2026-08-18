//Optimal Solution 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        //head is the next ptr 

        ListNode fast = dummy; 
        ListNode slow = dummy; 

        for(int i = 0; i<=n; i++){
            fast = fast.next; 
        }

        while(fast!=null){
            slow = slow.next; 
            fast = fast.next; 
        }

        slow.next = slow.next.next; 
        //skip the nth node 

        return dummy.next; 
    }
}

//Time complexity = O(n) <-clears in one go
//Space complexity = O(n) <-the new lists store the nodes