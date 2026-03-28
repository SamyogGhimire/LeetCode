class Solution {
    public int[] getNoZeroIntegers(int n) {
        // Try starting with your "9s" logic
        int count = String.valueOf(n).length();
        int a = (int) Math.pow(10, count - 1) - 1;
        
        // If n is small (like 10), count-1 is 9. If n is 2, count-1 is 0.
        // We need at least a = 1.
        if (a < 1) a = 1;

        int b = n - a;

        // Check if b contains any zero. If it does, just search 
        // by incrementing 'a' until both are "clean".
        while (hasZero(a) || hasZero(b)) {
            a++;
            b = n - a;
        }

        return new int[]{a, b};
    }

    // Helper method to check if a number contains the digit 0
    private boolean hasZero(int num) {
        return String.valueOf(num).contains("0");
    }
}
