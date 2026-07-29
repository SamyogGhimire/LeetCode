class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new LinkedList<>();
        int[] ans = new int[n-k+1];

        for (int right = 0; right < n; right++){
            if (!deque.isEmpty() && deque.peekFirst() <= right - k){
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[right]){
                deque.pollLast();
            }
            deque.addLast(right);
            if (right >= k-1){
                ans[right-k+1] = nums[deque.peekFirst()];
            }
        }
        return ans;

    }
}