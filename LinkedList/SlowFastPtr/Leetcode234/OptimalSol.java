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

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head; 

        while(fast!=null&&fast.next!=null){
            slow = slow.next; 
            fast = fast.next.next; //reaches twice as far as slow
        }

        ListNode secondHalf = reverse(slow); //reverses a linked list

        ListNode firsthalf = head; 
        ListNode temp = secondHalf; 

        while(temp!=null){
            if(temp.val!=firsthalf.val)
                return false; 
            firsthalf = firsthalf.next; 
            temp = temp.next; 
        }

        return true; 

    }

    private ListNode reverse(ListNode head){
        ListNode prev = null; 
        ListNode curr = head; 

        while(curr!= null){
            ListNode next = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = next; 
        }

        return prev; 
    }
}

//Time complexity = O(2N) <- we go through the linked list almost twice
//Space complexity = O(1) <-does not utilize another data structure 
