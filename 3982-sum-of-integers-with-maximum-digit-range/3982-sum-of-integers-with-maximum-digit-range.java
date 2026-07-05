class Solution {
    public int maxDigitRange(int[] nums) {

        int[] ranges = new int[nums.length];
        
        int digitRange = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            int maxDigit = 0;
            int minDigit = Integer.MAX_VALUE;

            if (num == 0) minDigit = maxDigit = 0;
            else {
                while (num != 0){
                    int digit = num % 10;
                    maxDigit = Math.max(maxDigit, digit);
                    minDigit = Math.min(minDigit, digit);
                    num = num / 10;
                }
            }
            ranges[i] = maxDigit - minDigit;
            digitRange = Math.max(digitRange, ranges[i]);
        }

        int sum = 0;
        for (int i = 0 ; i < nums.length; i++){
            if (ranges[i] == digitRange){
                sum += nums[i];
            }
        }
        return sum;
    }
}