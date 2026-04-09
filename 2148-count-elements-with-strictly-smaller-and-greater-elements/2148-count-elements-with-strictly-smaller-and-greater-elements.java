class Solution {
    public int countElements(int[] nums) {
        int mini = nums[0], maxi = nums[0];

        for (int i : nums) {
            mini = Math.min(mini, i);
            maxi = Math.max(maxi, i);
        }

        int c = 0;

        for (int i : nums) {
            if (i != mini && i != maxi) c++;
        }

        return c;
    }
}