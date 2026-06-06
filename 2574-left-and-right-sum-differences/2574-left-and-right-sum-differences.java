class Solution {
    public int[] leftRightDifference(int[] nums) {
int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] ans = new int[n];

        leftSum[0] = 0;
        for (int i = 1; i < nums.length; i++){
            for (int j = 0; j<i; j++){
                leftSum[i] += nums[j]; 
            }
        }
        for (int i = 0; i < n; i++) {
            rightSum[i] = 0;
            for (int j = i + 1; j < n; j++) {
                rightSum[i] += nums[j];
            }
        }

        for (int i = 0; i<nums.length; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}