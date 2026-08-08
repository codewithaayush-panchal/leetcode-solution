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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return list1;
        }   else if (list1 == null) {
            return list2;
        }   else if (list2 == null) {
            return list1;
        }
        ListNode head = null;
        ListNode temp = null;
        while (list1 != null && list2 != null) {
            ListNode node = new ListNode();
            if (list1.val <= list2.val) {
                node.val = list1.val;
                if (temp == null) {
                    temp = node;
                } else {
                    temp.next = node;
                    temp = node;
                }
                if (head == null) {
                    head = node;
                }
                list1 = list1.next;
            }   else {
                node.val = list2.val;
                if (temp == null) {
                    temp = node;
                }   else {
                    temp.next = node;
                    temp = node;
                }
                if (head == null) {
                    head = node;
                }
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            ListNode node = new ListNode(list1.val);
            temp.next = node;
            temp = node;
            list1 = list1.next;
        }
        while (list2 != null) {
            ListNode node = new ListNode(list2.val);
            temp.next = node;
            temp = node;
            list2 = list2.next;
        }

        return head;
    }
}