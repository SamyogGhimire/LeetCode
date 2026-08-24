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
    public void reorderList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        ListNode curr = head;
        while (curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        int left = 0;
        int right = list.size() - 1;

        while (left <= right){
            ans.add(list.get(left));
            if (left != right) ans.add(list.get(right));

            left++;
            right--;
        }

        curr = head;

        for (int num : ans){
            curr.val = num;
            curr = curr.next;
        }
    }
}