class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int prod = 1;
        int left = 0;
        int ans = 0;

        for (int right = 0; right < n; right++){
            prod *= nums[right];

            while (prod >= k){
                prod /= nums[left];
                left++;
            } 
            ans += right - left + 1;
        }
        return ans;
    }
}