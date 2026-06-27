class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                boolean isPalindrome1 = checkPalindrome(s,left+1,right);
                boolean isPalindrome2 = checkPalindrome(s,left, right - 1);

                return isPalindrome1 || isPalindrome2;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(String s, int left, int right){
        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}