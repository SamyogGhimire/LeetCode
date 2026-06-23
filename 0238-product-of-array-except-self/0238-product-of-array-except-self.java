class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int [nums.length];
        res[0] = 1;

        for (int left = 1; left < nums.length; left++){
            res[left] = res[left-1] * nums[left-1];
        }

        int rightProd = 1;
        for (int right = nums.length - 1; right >= 0; right--){

            res[right] = res[right] * rightProd;
            rightProd *= nums[right];
        }
        return res;
    }
}