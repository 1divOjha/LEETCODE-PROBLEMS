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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // (I) - 2 passes
        // 1) one approach is i traverse full LL and finf length, then 
        // 2) traverse in the till <m-n+1
        // if(head==null){ return null;}
    
        // //if we dont include this dummy thing, we are gnna skip head node, but we may have to remove it, so we cant
        // ListNode dummy = new ListNode(0, head); // means 0- value. dummy.next =head' 
        // int m =0;

        // // 1- 2- 3- 4- 5- null     (say, n =2 from end, m-n+1 = 4 (i<m-n+1 (4) from i =1, ----2 iterations)
        // for(ListNode curr = head; curr!=null; curr=curr.next ){
        //     m++; // becomes 5 at last
        // }
        // if(m==n){
        //     return head.next;
        // }
        // ListNode temp = dummy;// so that we dont miss head node, starting from prev it
        // for(int i=0; i< m-n ;i++){
        //     temp= temp.next;
        // }

        // temp.next = temp.next.next;
        // return dummy.next;

//---------------------------------------------------------------------------------------------------------------------------------
        // ( II ) - single pass
        //2 pointer approach using 2nd and 1st pointer approach, 
        //move 1st n nodes ahead then move both at single node speed, untill 1st is not null
        //then 2nd reaches right position, so do 2nd.next = 2nd.next.next;

    if(head==null){ return null;}
       ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        ListNode second = dummy;

        for(int i =0; i<=n; i++){
            first=first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
       second.next = second.next.next;
        return dummy.next;



    }
}