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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        int i = 0;
        while (fast != null) {
            if (fast == slow && i != 0) {
                return true;
            }
            i++;
            if (fast.next != null) {
                fast = fast.next.next;
            }   else {
                fast = fast.next;
            }
            slow = slow.next;
        }
        return false;
    }
}