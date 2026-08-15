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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = head.next;
        ListNode head2 = null;
        ListNode k = null;


        while (pres != null) {
            if (prev == null) {
                if (pres.val != next.val) {
                    head2 = pres;
                    k = pres;
                }
            }   else {
                if (next != null) {
                    if (pres.val != prev.val && pres.val != next.val) {
                        if (k != null) {
                            k.next = pres;
                            k = pres;
                        }   else {
                            head2 = pres;
                            k = pres;
                        }
                    }   else {
                        if (k != null) {
                            k.next = null;
                        }
                    }
                }   else {
                    if (pres.val != prev.val) {
                        if (k != null) {
                            k.next = pres;
                            k = pres;
                        }   else {
                            head2 = pres;
                            k = pres;
                        }
                    }
                }
            }
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        return head2;
    }
}