class Solution {
    public void moveZeroes(int[] nums) {
       
        int c = 0;
        int n = nums.length;
         int[] temp = new int[n];
        for (int i=0; i<n; i++){
            if (nums[i]!=0){
                temp[c++]=nums[i];

                // c++;
            } 
        }
       while (temp.length<nums.length){
        temp[c] = 0;
        c++;
       }
       for (int i=0; i<temp.length;i++){
        nums[i]=temp[i];
       }
    }
}