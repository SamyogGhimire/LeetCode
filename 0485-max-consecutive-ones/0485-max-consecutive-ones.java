class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++){
            if (nums[right] == 1) count++;
            if (nums[right] == 0) count = 0;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}