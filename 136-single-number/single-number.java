class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i=0; i<nums.length; i++){
           int num = nums[i];
            int count = 0;
           for (int j=0;j<nums.length;j++){
            if (nums[j]==num){
                count++;
            }
            
           }
           if (count==1) return num;
        }
        return -1;
    }
}