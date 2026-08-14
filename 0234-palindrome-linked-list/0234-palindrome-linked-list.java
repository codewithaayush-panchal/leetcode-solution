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
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        node = head;
        return pOn(head.next);
    }
    static ListNode node = null;
    static boolean pOn(ListNode s) {
        if (s.next == null) {
            return node.val == s.val;
        }
        boolean a = pOn(s.next);
        node = node.next;
        boolean b = (s.val == node.val);
        return a && b;
    }
}