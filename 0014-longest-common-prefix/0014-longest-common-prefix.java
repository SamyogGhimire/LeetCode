class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        int minLen = Math.min(strs[0].length(), strs[n-1].length());
        String first = strs[0];
        String second = strs[n - 1];
        String ans = "";

        for (int i = 0; i < minLen; i++){
            if(first.charAt(i) == second.charAt(i)){
                ans+=first.charAt(i);
            } else {
                break;
            }
        }
        
        return ans;
    }
}