class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
       int rev=0;
       if (x<0){
        return false;
       }else if (x<10){
        return true;
       }
        while(x!=0){
            rev = rev*10+x%10;
            x=x/10;
           if (original==rev){
            return true;
           } 
        }
        return false;
    }
}