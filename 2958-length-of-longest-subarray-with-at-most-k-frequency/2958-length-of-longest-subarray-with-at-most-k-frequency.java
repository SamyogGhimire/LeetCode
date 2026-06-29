class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            int currFreq = map.get(nums[right]);

            while (currFreq > k){
                map.put(nums[left], map.get(nums[left])-1);
                currFreq = map.get(nums[right]);
                left++;
            }
            ans = Math.max(ans, right-left +1);
        }
        return ans;
    }
}