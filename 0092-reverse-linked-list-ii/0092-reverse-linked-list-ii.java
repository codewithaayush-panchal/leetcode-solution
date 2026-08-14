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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode l = head;
        ListNode r = head;
        {
            int i = 1;
            while (i != left) {
                l = l.next;
                i++;
            }
            i = 1;
            while (i != right) {
                r = r.next;
                i++;
            }
        }
        ListNode aR = r.next;
        ListNode prev = null;
        ListNode pres = l;
        ListNode next = pres.next;
        while (prev != r) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        ListNode temp = head;
        if (left != 1) {
            int i = 1;
            while (i != left-1) {
                temp = temp.next;
                i++;
            }        
            temp.next = prev;
        }   else {
            head = r;
        }
        l.next = aR;
        return head;
    }
}