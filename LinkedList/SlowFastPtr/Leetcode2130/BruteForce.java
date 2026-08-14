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
    public int pairSum(ListNode head) {
        Stack<Integer> st = new Stack<>(); 
        ListNode slow = head; 
        ListNode fast = head; 

        while(fast!=null&&fast.next!=null){
            st.push(slow.val); 
            slow = slow.next; 
            fast = fast.next.next; 
        }
        //half the list is stored on the stack. 
        
        int maxSum = 0; 
        while(slow!=null){
            maxSum = Math.max(st.pop()+slow.val, maxSum); 
            slow = slow.next; 
        }

        return maxSum; 
    }
}

//Time complexity = O(n) <-once traverses to find the middle, then pops stack and traverses the rest 
//Space complexity = O(n) <-uses stack to store half the list 