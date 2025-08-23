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
        ListNode dummy = new ListNode (0); // put zero in it;
        ListNode curr = dummy;
        int carry =0; // for first digit sum carry =0

        while(l1 != null || l2 != null || carry!=0){
            //until we make count= 0, if it was more; 
            //untill elemets left in any L1 or L2 , ,
            // if anyone is null , we add 0 for them, cuz the other list still has nodes
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x+ y + carry;

            carry = sum/10;
            // curr has an element, single node, now keep making new nodes next to current, and add sum remainder
            curr.next = new ListNode( sum % 10);
            curr = curr.next;
            if(l1 != null) l1=l1.next;
            if(l2 != null) l2=l2.next;

        }

        return dummy.next;
    }
}