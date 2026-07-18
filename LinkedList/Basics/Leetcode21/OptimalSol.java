//Optimal Solution <-uses recursive approach. 

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null)
            return list2; 
        else if(list2==null)
            return list1; 

        if(list1.val<=list2.val){
            list1.next = mergeTwoLists(list1.next, list2); 
            return list1; 
        }
        else{
            list2.next = mergeTwoLists(list2.next, list1); 
            return list2; 
        }
        
    }
}

//Time complexity = O(N+M) <-where N and M are the lengths of list1 and list2 respectively. 
//Space complexity = O(N+M) <-where N and M are the total items in list1 and list2 respectively. 
