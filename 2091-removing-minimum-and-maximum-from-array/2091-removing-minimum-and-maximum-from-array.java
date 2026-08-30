class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int ans = 0;

        if (nums.length < 2) return nums.length;

        for (int i = 0; i < nums.length; i++){
            min = Math.min(min, nums[i]);
            if (nums[i] == min) minIndex = i;

            max = Math.max(max, nums[i]);
            if (nums[i] == max) maxIndex = i;
        }

        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        int deleteLeft = right + 1;
        int deleteRight = nums.length - left;
        int deleteBothSides = (left + 1) + (nums.length - right);

        return Math.min(deleteLeft, Math.min(deleteRight, deleteBothSides));
    }
}