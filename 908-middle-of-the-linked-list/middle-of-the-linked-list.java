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
    
    public ListNode middleNode(ListNode head) {

        //using slow fast pointer
        ListNode slow = head;
        ListNode fast =head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        } 
return slow; // this will be at the middle, after coming out of while loop

    }}

        //do zero based indexing - did the sum myselffff********************************
//         ListNode middle = head;
//         if(head.next==null){
//             return head;
//         }
//         int i =0;
        
//         while(middle!=null){
//             middle = middle.next;
//             i++;
//         }
//         int pos = i/2;
//         for(int j =0; j<pos; j++){
//          head = head.next ;
            
//         }
//         return head;
//     }
// }