class Solution {
    public int minPairSum(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int result = 0;

        Arrays.sort(nums);

        while (left<right){
            int sum = nums[left] + nums[right];
            result = Math.max(result,sum);
            left++;
            right--;
        }
       return result;
    }
}