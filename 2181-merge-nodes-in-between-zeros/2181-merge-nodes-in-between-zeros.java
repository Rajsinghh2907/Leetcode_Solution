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
    public ListNode mergeNodes(ListNode head) {
        
        // ListNode temp = head;

        // while(temp != null && temp.next!= null){
        //     if(temp.next.val != 0){
        //         int sum = temp.val + temp.next.val;
        //         temp.val = sum;
        //         temp.next = temp.next.next;


        //     } else if(temp.next.val == 0 && temp.next.next == null){
        //         temp.next = null;
        //     } else{
        //         temp = temp.next;
        //     }
        // }

        // return head;





        ListNode New = new ListNode(0);
        ListNode curr = New;
        
        ListNode temp = head.next; // Skip the first 0
        int sum = 0;

        while (temp != null) {
            if (temp.val == 0) {
                // When encountering a 0, create a new node with the sum
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0; // Reset the sum
            } else {
                sum += temp.val; // Add value to the sum
            }
            temp = temp.next;
        }
        
        return New.next; // Skip the dummy node and return the actual head
    }
}