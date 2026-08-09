//Optimal Solution 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val; //change the value of current node 
        node.next = node.next.next; //skip the next node 
    }
}

//Time complexity = O(1)
//Space complexity = O(1)