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
        
        ListNode x = head;
        ListNode temp = head;

        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(n == size){
           return x.next; 
        }

        if(size == 1){
            return null;
        }

        int i = 1;
        int iToFind = size - n;
        ListNode prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

        return x;
        
    }
}