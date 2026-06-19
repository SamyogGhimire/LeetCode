class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        boolean isPerfect = false;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            } 
        }
        if (sum == num){
            isPerfect = true;
        } else {
            isPerfect = false;
        }
        return isPerfect;
    }
}