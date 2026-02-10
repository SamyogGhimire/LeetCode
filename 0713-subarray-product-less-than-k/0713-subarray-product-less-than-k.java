class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int j = 0;
        int prod = 1;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            prod *= nums[i];
            while(j <= i && prod >= k){
                prod = prod/nums[j];
                j++;
            }
            count += 1+ (i - j);
            }
            return count;
        }
    }
