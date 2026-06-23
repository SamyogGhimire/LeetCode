class Solution {
    public int findMaxLength(int[] nums) {
        HashMap <Integer, Integer> map =new HashMap<>();
        map.put(0,-1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                nums[i] = -1;
            } else {
                nums[i] = 1;
            }
        }
        int maxLen = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            
            if (map.containsKey(sum)){
                nums[i] = i - map.get(sum);
                maxLen = Math.max(nums[i],maxLen);
            }else {
                map.put(sum,i);
            }
        }
    return maxLen;
    }
}