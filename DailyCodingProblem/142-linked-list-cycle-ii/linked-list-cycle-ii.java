import java.util.HashSet;
import java.util.Set;

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
        if (head == null) {
            return null;
        }
    
        Set<ListNode> seenNodes = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
         
            if (seenNodes.contains(curr)) {
              return curr;
            } else {
                seenNodes.add(curr);
                curr = curr.next;
            }
        }
   
        return null;
    }
}