class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1];
        int duplicate = -1, missing = -1;

        for (int num : nums) {
            count[num]++;
            if (count[num] == 2) {
                duplicate = num;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}
