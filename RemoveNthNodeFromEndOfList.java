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
        int size = 0;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            size++;
        }
        ListNode currNode = head;
        while(currNode != null) {
            if(size == n) {
                 head = currNode.next;
                 break;
                
            }
            if(size == n+1) {
                currNode.next = currNode.next.next;
                break;
            }
            currNode = currNode.next;
            size--;
        }
        
        return head;
    }
}
