class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true){
            n = squareSum(n);
            if (n == 1){
                return true;
            } else if (set.contains(n)){
                return false;
            }
            set.add(n);
        }
    }

    public static int squareSum(int n){
        int totalSum = 0;
        while (n!=0){
            int digit = n % 10;
            totalSum += digit * digit;
            n = n / 10;
        }
        return totalSum;
    }
}