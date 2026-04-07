class Solution {
    public int check(int num){
        return (int)(Math.log10(num)+1);
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(check(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }
}