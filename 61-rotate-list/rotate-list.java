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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null||head.next == null || k==0){
            return head;
        }
        int length = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        k = k%length;
        if(k==0) return head;
        for(int i =0 ;i<k;i++){
        ListNode prevLast = head;
        while(prevLast.next.next !=null){
            prevLast = prevLast.next;
        }
        ListNode last = prevLast.next;
        last.next = head;
        head = last;
        prevLast.next = null;
        }
        return head;
     

        
    }
}