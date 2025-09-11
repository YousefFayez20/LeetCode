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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Head = null;
        if(list1 == null && list2 == null){
            return Head;
        }
        if(list1 == null && list2 != null){
            Head = list2;
            return Head;
        }
        if(list1 != null && list2 == null){
            Head = list1;
            return Head;
        }
        if(list1.val >= list2.val ){
            Head = new ListNode( list2.val);
            list2 = list2.next;
        }else{
            Head = new ListNode( list1.val);
            list1 = list1.next;
        }
      ListNode curr = Head;
      while(list1 != null && list2 != null){
        if(list1.val >= list2.val ){
            curr.next = new ListNode( list2.val);
            list2 = list2.next;
        }else{
            curr.next = new ListNode( list1.val);
            list1 = list1.next;
        }
        curr = curr.next;
      }
       while(list2 != null){
        curr.next = new ListNode( list2.val);
        list2 = list2.next;
        curr = curr.next;

       }
         while(list1 != null){
        curr.next = new ListNode( list1.val);
        list1 = list1.next;
        curr = curr.next;

       }
      return Head;


      
    }
}
/**
  ListNode n1 = new ListNode(-1);
        
         if(list1.val > list2.val){
                n1 = list2;
                list2 = list2.next;
            }
            else {
                n1 = list1;
                list1 = list1.next;
            }
            
        while(list1 !=null || list2 != null){
           if(list1.val >= list2.val ){
              n1.next = list2;
                list2 = list2.next;
           }
           else {
                n1.next = list1;
                list1 = list1.next;
            }
            n1 = n1.next;
        }
        return list1;

 */