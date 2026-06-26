class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        int n = s.length();

        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                if(isPalindromic(s,i,j)){
                    if (j-i+1 > result.length()){
                        result = s.substring(i,j+1);
                    }
                }
            }
        }
        return result;
    }

    private boolean isPalindromic(String s, int left, int right){
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