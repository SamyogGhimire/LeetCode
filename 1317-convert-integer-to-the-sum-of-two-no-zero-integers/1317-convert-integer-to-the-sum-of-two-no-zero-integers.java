class Solution {
    public int[] getNoZeroIntegers(int n) {

        int count = String.valueOf(n).length();
        int a = (int) Math.pow(10, count - 1) - 1;
        
        if (a < 1) a = 1;

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
