class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            max = Math.max(max, n);
        }

        if (k == 1) {
            int maxNum = -1;

            for (int n : nums) {
                if (map.get(n) == 1) {
                    maxNum = Math.max(maxNum, n);
                }
            }
            return maxNum;
        }

        if (k == nums.length) {
            return max;
        }

        int maxNum = -1;

        if (map.get(nums[0]) == 1) {
            maxNum = Math.max(maxNum, nums[0]);
        }

        if (map.get(nums[nums.length - 1]) == 1) {
            maxNum = Math.max(maxNum, nums[nums.length - 1]);
        }

        return maxNum;
    }
}