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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
         Set<Integer> hs = new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));


        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        
        while (curr.next != null) {
            if (hs.contains(curr.next.val)) {
                ListNode Del = curr.next;
                curr.next = curr.next.next;
                Del.next = null;  
            } else {
                curr = curr.next;
            }
        }
        
        return dummy.next;
    }
}