/*21. Merge Two Sorted Lists
Solved
Easy
Topics
Companies
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.

*/
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
class MergeSortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode t1 = list1;
        while(t1!=null){
            al.add(t1.val);
            t1=t1.next;
        }
        ListNode t2 = list2;
        while(t2!=null){
            al.add(t2.val);
            t2=t2.next;
        }
        Collections.sort(al);
        ListNode dum = new ListNode(-1);
        ListNode temp = dum;
        for(int val:al){
            temp.next=new ListNode(val);
            temp=temp.next;
        }
        return dum.next;
    }
}
