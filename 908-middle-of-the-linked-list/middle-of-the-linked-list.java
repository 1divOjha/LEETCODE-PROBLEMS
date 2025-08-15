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
        //do zero based indexing
        ListNode middle = head;
        if(head.next==null){
            return head;
        }
        int i =0;
        
        while(middle!=null){
            middle = middle.next;
            i++;
        }
        int pos = i/2;
        for(int j =0; j<pos; j++){
         head = head.next ;
            
        }
        return head;
    }
}