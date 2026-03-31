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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy; 
        int carry = 0;

        // continue till there are items in lists or carry is pending
        while(l1 != null || l2 != null || carry != 0) {
            // get current value from both the list
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;         // eg: 15 / 10 = 1
            int digit = sum % 10;     // eg: 15 % 10 = 5

            current.next = new ListNode(digit); 
            current = current.next;

            // advance the l1 and l2 lists if not exhausted
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummy.next; 
    }
}
