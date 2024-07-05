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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode Next = curr.next;

        while(Next != null){
            if ((curr.val > prev.val && curr.val > Next.val) || (curr.val < prev.val && curr.val < Next.val)) {
                list.add(i);
            }
            // Move to the next set of nodes
            prev = curr;
            curr = Next;
            Next = Next.next;
            i++;
        }

        if(list.size() < 2){
            return new int[] {-1, -1};
        }

        // Calculate the minimum and maximum distances between critical points
        int minDistance = Integer.MAX_VALUE;
        int maxDistance = list.get(list.size() - 1) - list.get(0);

        for (int j = 1; j < list.size(); j++) {
            minDistance = Math.min(minDistance, list.get(j) - list.get(j - 1));
        }

        return new int[]{minDistance, maxDistance};


    }
}