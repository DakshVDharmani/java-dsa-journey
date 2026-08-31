//Optimal solution 

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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2]; 
        //initialize if no critical point found
        ans[0] = -1; 
        ans[1] = -1; 

        ListNode prev = head; 
        ListNode curr = prev.next;  
        ListNode nxt = curr.next; 

        int idx = 0;
        int firstFound = 0, lastFound = 0, minDist = Integer.MAX_VALUE;  

        while(nxt!=null){
            idx++; 
            if((curr.val>prev.val&&curr.val>nxt.val)||(curr.val<prev.val&&curr.val<nxt.val)){
                if(firstFound == 0)
                    firstFound = idx;  
                
                
                if(lastFound!=0)
                    minDist = Math.min(idx-lastFound, minDist); 

                lastFound = idx; 
            }
            
            prev = prev.next; 
            curr = curr.next; 
            nxt = nxt.next; 
        }

        if(firstFound == 0 || firstFound==lastFound)
            return ans; 

        ans[0] = minDist; 
        ans[1] = lastFound - firstFound; 

        return ans; 
    }
}

//Time complexity = O(n)
//Space complexity = O(1)