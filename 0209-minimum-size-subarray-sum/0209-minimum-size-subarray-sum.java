class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minCount = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = 0;
        boolean exist = false;

        while(right < nums.length){
            sum += nums[right];
            right++;
            while (sum >= target){
                minCount = Math.min(minCount, right - left);
                exist = true;
                sum -= nums[left];
                left++;
            }
        }

        if (!exist){
            return 0;
        }else {
            return minCount;
        }
    }
}