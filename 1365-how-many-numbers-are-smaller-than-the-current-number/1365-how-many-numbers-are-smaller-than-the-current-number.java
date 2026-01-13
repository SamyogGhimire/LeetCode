// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {
        
//         int[] ans = new int[nums.length];
//         for (int i=0; i<nums.length; i++){
//             int count= 0;
//             for (int j=nums.length-1; j>=0; j--){
//                 if (nums[i] > nums[j]){
//                     count++;
//                     ans[i] = count;
//                 }
//             }
//         }
//         return ans;
//     }
// }

class Solution{
    public int[] smallerNumbersThanCurrent(int[] nums){
        int[] freq = new int [101];
        int count = 0;
        int[] ans = new int [nums.length];

        for (int n: nums){
            freq[n]++;        
        }

        for (int i=0;i<101;i++){
            int temp = freq[i];
            freq[i] = count;
            count += temp;
        }

        for (int i=0; i<nums.length; i++){
            ans[i] = freq[nums[i]];
        }
        return ans;
    }
}
