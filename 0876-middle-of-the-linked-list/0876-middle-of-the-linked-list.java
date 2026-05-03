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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;       //Tortoise Hair method
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        // ListNode temp = head;
        // int cnt=0;
        // while(temp != null){
        //     cnt++;
        //     temp =temp.next;
        // }
        // for(int i=0;i<cnt/2;i++){
        //     head=head.next;
        // }
        // return head;
    }
}