/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;


            if(slow == fast){

// NOT KNOW HOW WE FIND NODE NUMBER COPY PASTE ONLY THE BELOW CODE UPAR KHUD SE LIKHE HAI
            slow = head; // slow = head krne aur slow and fast ko ek ek krke increase krenge to slow aur fast dubara whi milega jha pr cycle start hua tha.

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}