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
        if(head == null){
            return null;
        }
        ListNode L = head;
        ListNode NoDuplicates = new ListNode(head.val);
        ListNode NewHead = NoDuplicates;
        while(L !=null){
            if(L.val != NoDuplicates.val){
                NoDuplicates.next = new ListNode(L.val);
                NoDuplicates = NoDuplicates.next ;
            }
            L = L.next;
        }

        return NewHead;
    }
}