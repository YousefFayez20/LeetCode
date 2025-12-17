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
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        int L = 0;
        int R = list.size()-1;
        while(L<R){
            if(!list.get(L).equals(list.get(R)))return false;
            L++;
            R--;
        }
        return true;
        
    }
}