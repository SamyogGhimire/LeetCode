class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int x =0;
        for (int i = 1; i<n; i++){
            if (nums[i-1]>nums[i]){
                x++;
                if (x>1){
                    return false;
                }
                if (nums[n-1]>nums[0]){
            x++;
        }
            }
        
        }
        return x<=1;
    }
}
