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
        
        ListNode temp = head;

        while(temp != null && temp.next!= null){
            if(temp.next.val != 0){
                int sum = temp.val + temp.next.val;
                temp.val = sum;
                temp.next = temp.next.next;


            } else if(temp.next.val == 0 && temp.next.next == null){
                temp.next = null;
            } else{
                temp = temp.next;
            }
        }

        return head;
    }
}