class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        String ch = str.toLowerCase();

        char[] cha = ch.toCharArray();
        int n = cha.length;

        for (int i = 0; i < n; i++){
            if (cha[i] != cha[n-1-i]){
                return false;
            }
        }
        return true;
    }
}