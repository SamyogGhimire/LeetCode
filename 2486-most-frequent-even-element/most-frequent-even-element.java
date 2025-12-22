class Solution {
    public int mostFrequentEven(int[] nums) {
        int maxCount = 0;
        int result = -1;

        for (int i=0;i<nums.length;i++){
            int count =0;
            if (nums[i]%2!=0) continue;
            
            for (int j=i;j<nums.length;j++){
                
                    if (nums[i]==nums[j]){
                        count++;
                    }
            }

            if (count>maxCount || (count==maxCount) && nums[i]<result){
               maxCount = count;
                result = nums[i];
            }
        }
        return result;
    }
}