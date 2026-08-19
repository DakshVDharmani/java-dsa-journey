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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||left==right)
            return head; 

        ListNode dummy = new ListNode(0); 
        //should be standard declaration 

        dummy.next = head; 
        ListNode beforeLeft = dummy; 
        
        for(int i = 1; i<left; i++)
            beforeLeft = beforeLeft.next; 
        
        ListNode curr = beforeLeft.next; 
        ListNode prev = null;
        ListNode afterLeft = beforeLeft.next;  
        //preserves the connection to after right

        for(int i = 0; i<right-left+1; i++){
            ListNode next = curr.next; 

            curr.next = prev; 
            prev = curr; 
            curr = next; 
        }

        beforeLeft.next = prev; 
        afterLeft.next = curr; 

        return dummy.next;  
    }
}

//Time complexity = O(n) <-just iterates through the list
//Space complexity = O(1)