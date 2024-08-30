/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode inter1 = headA;
        ListNode inter2 = headB;

        while(inter1 != inter2) {
            if(inter1 == null){
                inter1 = headB;
            } else if(inter2 == null){
                inter2 = headA;
            } else{
                inter1 = inter1.next;
                inter2 = inter2.next;
            }
        }
        return inter2;
    }
}