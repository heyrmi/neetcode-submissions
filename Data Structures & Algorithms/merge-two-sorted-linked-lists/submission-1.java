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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // First node will be dummy
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy; 

        // While both lists have value - compare and add
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2; 
                l2 = l2.next;
            }
            current = current.next;
        }

        // add the remaining ones
        current.next = (l1!= null) ? l1 : l2;

        return dummy.next; 
    }
}