class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = 1;
        int b = n - a;

        while (hasZero(a) || hasZero(b)) {
            a++;
            b = n - a;
        }

        return new int[]{a, b};
    }

    private boolean hasZero(int num) {
        return String.valueOf(num).contains("0");
    }
}
