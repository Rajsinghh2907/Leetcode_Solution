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
    public ListNode swapPairs(ListNode head) {

        if(head==null){
            return null;
        }
        
        ListNode Node = head;

        while(Node.next != null){

            int value = Node.val;
            Node.val = Node.next.val;
            Node.next.val = value;

            if(Node.next.next != null){
                Node = Node.next.next;
            } else{
                Node = Node.next;
            }
        }
        return head;
    }
}