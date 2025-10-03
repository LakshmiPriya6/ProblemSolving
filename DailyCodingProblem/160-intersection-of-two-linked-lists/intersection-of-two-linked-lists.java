/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> list1 = new HashSet<ListNode>();
        ListNode curr = headA;
        while(curr != null){
            list1.add(curr);
            curr = curr.next;
        }
        
        ListNode curr1 = headB;
        while(curr1 !=null){
            if(list1.contains(curr1)){
                return curr1;
            }
            curr1 = curr1.next;
        }
        return null;
    }
}