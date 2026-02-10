class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length / 2;
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        int[] ans = new int [nums.length];

        for (int num : nums){
            if (num < 0){
                negative.add(num);
            } else if (num > 0){
                positive.add(num);
            }
        }
        int index = 0;
        for (int i = 0; i < n; i++){
            ans[index++] = positive.get(i);
            ans[index++] = negative.get(i);
        }
        return ans;
    }
}