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
        int size = 0;
        {
            ListNode temp = head;
            while (temp != null) {
                temp = temp.next;
                size++;
            }
        }
        if (n > size) {
            return head;
        }
        if (size == 1 && n == 1) {
            return null;
        }
        if (size == 1) {
            return head;
        }
        if (size == n) {
            return head.next;
        }
        ListNode prev = null;
        ListNode curr = head;
        
        for (int i = 0; i < size-n; i++) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        curr.next = null;
        return head;
    }
}