/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int pos = -1;
        if(head == null){
            return null;
        }
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;
        set.add(curr);
        while(curr != null){
            curr =curr.next;
            if(set.contains(curr)){
                return curr;
            }
            set.add(curr);
        }
        return null;

        
    }
}