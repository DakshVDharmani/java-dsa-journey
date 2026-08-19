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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> hs = new HashSet<>(); 

        for(int num : nums)
            hs.add(num); 

        ListNode dummy = new ListNode(0, head); 
        ListNode temp = dummy; 

        while(temp.next!=null){
            if(hs.contains(temp.next.val))
                temp.next = temp.next.next; 
            else
                temp = temp.next; 
        }

        return dummy.next; 
    }
}

//Time complexity = O(n+m) <-m is the length of nums 
//Space complexity = O(n) <-worst case if the HashSet stores as many values as the list 