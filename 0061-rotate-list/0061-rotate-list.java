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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = 0;
        {
            ListNode temp = head;
            while (temp != null) {
                length++;
                temp = temp.next;
            }
        }
        int r = k % length;
        int d = length-r;
        if (d == 0 || d == length) {
            return head;
        }

        ListNode t = head;
        for (int i = 1; i < d; i++) {
            t = t.next;
        }

        ListNode a = t.next;
        ListNode b = t.next;
        t.next = null;
        while (a.next != null) {
            a = a.next;
        }
        a.next = head;
        head = b;
        return head;
    }
}