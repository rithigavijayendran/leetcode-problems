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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val - b.val);
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        for(ListNode t:lists){
            if(t!=null) pq.add(t);
        }
        while(pq.size()>0){
            ListNode rem = pq.remove();
            temp.next = rem;
            temp = rem;
            rem = rem.next;
            if(rem!=null) pq.add(rem);
        }
        return ans.next;
    }
}