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
    public ListNode listreverse(ListNode head){
        ListNode curr = head; 
        ListNode prev = null; 
        
        while(curr!=null){
            ListNode next = curr.next; 

            curr.next = prev; 
            prev = curr; 
            curr = next; 
        }

        return prev; 
    }
    public ListNode removeNodes(ListNode head) {
        ListNode rev = listreverse(head); 

        ListNode temp = rev; 

        int maxVal = temp.val; 

        while(temp!=null&&temp.next!=null){
            if(temp.next.val>=maxVal){
                maxVal = temp.next.val; 
                temp = temp.next; 
                continue; 
            }

            temp.next = temp.next.next; 

        }

        ListNode ans = listreverse(rev); 

        return ans; 
    }
}

//Time complexity = O(n)
//Space complexity = O(1)