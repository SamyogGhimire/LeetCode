class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currSum = Integer.MIN_VALUE;
        double maxSum = Integer.MIN_VALUE;
        double sum = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++){
            sum += nums[j];

            if (j >= k-1){
                currSum = Math.max(currSum, sum / k);
                maxSum = Math.max(currSum,maxSum);

                sum -= nums[i];
                i++;
            }
        }
        return maxSum ;
    }
}