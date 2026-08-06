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
    public void reorderList(ListNode head) {
        ListNode temp = new ListNode(); 

        if (head == null || head.next == null || head.next.next == null)
            return;

        temp = head; 
        ListNode next = head.next; 
        while(temp.next!=null)
            temp = temp.next; 
        
        ListNode cut = head; 

        while(cut!=null){
            if (cut.next == temp)
                cut.next = null; 
            cut = cut.next; 
        }

            

        head.next = temp;
        temp.next = next; 

        reorderList(next); 
    }
}

//Time complexity = O(N^2) <-as it traces once and then recursively over and over. 
//Space complexity = O(N) <-stores each node once. 
