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
        ListNode R = head;
        ListNode L = head;
        int count=0;
        if(head.next == null){
            return null;
        }
        while(R.next != null){
            R=R.next;
            count++;
        }
        int i = 0;
        while(i<count -n){
            L = L.next;
            i++;
        }
        if(count < n){
            head = head.next;
        }else{
            L.next = L.next.next;

        }
        
        return head;

        
    }
}