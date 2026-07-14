class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingleDigit = 0;
        int sumDoubleDigit = 0;

        for(int num: nums){
            if (num < 10){
                sumSingleDigit += num;
            } else {
                sumDoubleDigit += num;
            }
        }

        if (sumSingleDigit > sumDoubleDigit || sumSingleDigit < sumDoubleDigit){
            return true;
        }
        return false;
    }
}