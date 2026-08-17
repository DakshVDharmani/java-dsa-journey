//Optimal solution 

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
    public ListNode partition(ListNode head, int x) {
        
        ListNode less = new ListNode(0); 
        ListNode greater = new ListNode(0); 

        ListNode l = less; 
        ListNode g = greater; 

        ListNode temp = head; 

        while(temp!=null){
            if(temp.val<x){
                l.next = new ListNode(temp.val); 
                l = l.next; 
            }
            
            else{
                g.next = new ListNode(temp.val); 
                g = g.next; 
            }

            temp = temp.next; 
        }

        l.next = greater.next; 

        return less.next; 
    }
}

//Time complexity = O(n) 
//Space complexity = O(n) <-saves complete linked list in two halves 