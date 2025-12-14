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
        ListNode curr = head;
        int length=0;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        if(n==length) return head.next;
        curr= head;
        for(int i=0;i<length-n-1;i++){
            curr = curr.next;
        }
        ListNode second = curr.next;
        if(n>1){
            curr.next = second.next;
        }else{
            curr.next = null;
        }
        
        return head;
    }
}