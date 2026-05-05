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
        if(head.next == null) return null;
        ListNode temp = head;
        int cnt=0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        if (cnt == n) return head.next;
        ListNode current = head;
        for(int i =1;i<cnt-n;i++){
            current = current.next;
        }
        ListNode remove = current.next;
        current.next =current.next.next;
        remove.next = null;
        return head;
    }
}