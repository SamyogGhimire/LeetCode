class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] a = new int[101];
        for(int n : nums) ++a[n];
        for(int i = 0; i < nums.length; ++i) {
            int n = nums[i];
            if(a[n] == 1 && n % 2 == 0) return n;
        }
        return -1;
    }
}