class Solution {
    public int maxProduct(int n) {
        int num1 = 0, num2 = 0;
        while(n > 0){
            int temp = n%10;
            if(num1 < temp){
                num2 = num1;
                num1 = temp;
            } else if(num2 < temp) num2 = temp;
            n/=10;
        }
        return num1*num2;
    }
}