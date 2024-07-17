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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        // ONE OF THE BASIC SOLUTION
        
        if (head == null || head.next == null) { // CHECK THE CONDITION IF LINKEDLIST IS EMPTY
            return head;
        }

        ListNode curr = head; //assign the head value to curr

        while (curr != null && curr.next != null) {
            int gcdValue = gcd(curr.val, curr.next.val); // call the GCD function
            ListNode gcdNode = new ListNode(gcdValue); // nor Add the gcd in LinkedList
            gcdNode.next = curr.next;
            curr.next = gcdNode;
            curr = gcdNode.next;
        }

        return head;
    }

    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}