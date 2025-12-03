class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (int j=1; j<nums.length; j++){
            if (nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}