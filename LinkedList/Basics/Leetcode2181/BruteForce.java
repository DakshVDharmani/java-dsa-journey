//Brute Force solution 

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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0); 

        dummy.next = head; 

        ListNode temp = dummy; 

        while(temp.next!=null){
            while(temp.next.val != 0){
                temp.val += temp.next.val; 
                temp.next = temp.next.next; 
                //skip the node 
            }

            //skipping last zero
            if(temp.next.next == null){
                temp.next = null; 
                break; 
            }

            temp = temp.next;
        }

        return dummy.next; 
    }
}

//Time complexity = O(n)
//Space complexity = O(1)