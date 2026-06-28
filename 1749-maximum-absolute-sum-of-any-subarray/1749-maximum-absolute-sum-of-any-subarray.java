class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currSum = nums[0];
        int currSum1 = nums[0];
        int minSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(currSum, maxSum);

            currSum1 = Math.min(nums[i], currSum1 + nums[i]);
            minSum = Math.min(currSum1, minSum);
        }
        // maxSum = Math.abs(maxSum);
        minSum = Math.abs(minSum);

        return Math.max(maxSum, minSum);
    }
}