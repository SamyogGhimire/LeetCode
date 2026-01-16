class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        HashSet <Character> charSet = new HashSet<>();

        while (right < s.length()){
            if (!charSet.contains(s.charAt(right))){
                charSet.add(s.charAt(right));
                right++;

                maxLen = Math.max(charSet.size(),maxLen);
            } else {
                charSet.remove(s.charAt(left));
                left++;
            }
        }
    return maxLen;
    }
}