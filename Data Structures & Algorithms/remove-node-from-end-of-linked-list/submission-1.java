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
        ListNode mock = head;
        int size = 0;

        if(head.next == null){
            return null;
        }

        while(mock != null){
            mock = mock.next;
            size++;
        }
        System.out.println(size);
        mock = head;
        for(int i = 0; i<size-n-1; i++){
            mock = mock.next;
        }
        if(size == n){
            return mock.next;
        }
        mock.next = mock.next.next;
        return head;
    }
}
