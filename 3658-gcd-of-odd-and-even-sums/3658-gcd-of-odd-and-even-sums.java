class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even = 2;
        int odd = 1;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++){
            oddSum += odd;
            evenSum += even;
            odd = odd + 2;
            even = even + 2;
        }
        
        while (evenSum != 0){
            int temp = evenSum;
            evenSum = oddSum % evenSum;
            oddSum = temp;
        }
        return oddSum;
    }
}