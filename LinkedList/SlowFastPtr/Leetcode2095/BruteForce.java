package LinkedList.SlowFastPtr.Leetcode2095;
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
    public ListNode deleteMiddle(ListNode head) {

        if(head.next == null)
            return null; 

        int n = 0; 

        ListNode temp = head; 

        while(temp!=null){
            n++; 
            temp = temp.next; 
        }

        temp = head; //refigure 

        for(int i = 0; i<n/2-1;i++){
            temp = temp.next; 
        }

        temp.next = temp.next.next; //skips the middle iteration 

        return head; 
    }
}

//Time complexity = O(1.5N) <-goes through the list once to count 
//Space complexity = O(1) 