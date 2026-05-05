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
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) return head.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
        
        // if(head.next == null) return null;
        // ListNode temp = head;
        // int cnt=0;
        // while(temp != null){
        //     cnt++;
        //     temp = temp.next;
        // }
        // if(cnt == n) return head.next;
        // ListNode current = head;
        // for(int i =1;i<cnt-n;i++){
        //     current = current.next;
        // }
        // current.next =current.next.next;
        // return head;
    }
}