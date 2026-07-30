class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;

        ListNode prev = head;
        ListNode curr = head.next;
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if (n == count) return head.next;

        while (count > n + 1 && curr != null) {
            prev = curr;
            curr = curr.next;
            count--;
        }

        if (curr == null) return head;

        prev.next = curr.next;
        return head;
    }
}