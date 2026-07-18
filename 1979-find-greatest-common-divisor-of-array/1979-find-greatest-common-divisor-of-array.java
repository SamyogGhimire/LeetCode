class Solution {
    public int findGCD(int[] nums) {
        int smallNum = Integer.MAX_VALUE;
        int largeNum = Integer.MIN_VALUE;

        for (int num: nums){
            smallNum = Math.min(smallNum, num);
            largeNum = Math.max(largeNum, num);
        }

        while(largeNum != 0){
            int temp = largeNum;
            largeNum = smallNum % largeNum;
            smallNum = temp;
        }
        return smallNum;
    }
}