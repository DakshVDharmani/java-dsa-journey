//Brute force solution 

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
    public ListNode reverseList(ListNode head) {

        if(head == null)
            return null; 

        Stack<Integer> st = new Stack<>();
        //uses property of stack, wastes more memory. 

        ListNode temp = head; 

        while(temp != null){
            st.push(temp.val); 
            temp = temp.next; 
        }

        ListNode ans = new ListNode(); 
        ListNode curr = ans; 

        while(!st.isEmpty()){
            curr.next = new ListNode(st.pop()); 
            curr = curr.next; 
        }

        return ans.next; 
    }
}

//Time complexity = O(n) <-runs through the complete linked list once, and then pops each item again to be pushed. 
//Space complexity = O(n) <-memory is utilized in stack. 
