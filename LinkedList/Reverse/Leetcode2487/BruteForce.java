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
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head; 
        Stack<Integer> st = new Stack<>(); 

        while(temp!=null){
            while(!st.isEmpty()&&st.peek()<temp.val)
                st.pop(); 

            st.push(temp.val); 
            temp = temp.next; 
        }

        ListNode dummy = new ListNode(0); 

        while(!st.isEmpty()){
            dummy.next = new ListNode(st.pop(), dummy.next); 
        }

        return dummy.next;
    }
}

//Time complexity = O(n)
//Space complexity = O(n) <-uses stack to store list elements 