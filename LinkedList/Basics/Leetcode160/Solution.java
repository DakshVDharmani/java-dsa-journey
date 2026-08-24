//Brute Force solution 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA; 
        ListNode b = headB; 

        while(a != b){
            a = a!=null?a.next:headA; 
            b = b!=null?b.next:headB; 

        }

        return a; 
    }
}

//Time complexity = O(n+m*) <-total elements iterated until the intersection is found
//Space complexity = O(1)