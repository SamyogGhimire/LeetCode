class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

            for (int j = 0; j<nums.length; j++){
                sum += nums[j]; 
                maxSum = Math.max(maxSum, sum);
                if (sum<0){
                    sum = 0;
                }
            }
        return maxSum;
    }
}