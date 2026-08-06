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
    public boolean isPalindrome(ListNode head) {

        Stack<Integer> st = new Stack<>(); 

        ListNode temp = head; 

        while(temp!=null){
            st.push(temp.val);  

            temp = temp.next; 
        }

        temp = head; //reroute

        while(temp!=null){
            if(st.peek()!=temp.val)
                return false; 
            st.pop(); 
            
            temp = temp.next; 
        }


        return true; 
    }
}

//Time complexity = O(2N) <-as the linked list is iterated twice 
//Space complexity = O(N) <-as the contents of the list are stored in a stack
