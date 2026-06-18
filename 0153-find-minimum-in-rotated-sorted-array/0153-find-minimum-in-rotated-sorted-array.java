class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;
        
        if (nums[left] < nums[right] || nums.length == 1){
            return nums[left];
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            if (mid < right && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            } else if (mid > left && nums[mid] < nums[mid-1]){
                return nums[mid];
            }

            if (nums[mid] >= nums[left]){
                left = mid + 1;
            }
            if (nums[mid] <= nums[right]){
                right = mid - 1;
            }
        }
        return -1;
    }
}