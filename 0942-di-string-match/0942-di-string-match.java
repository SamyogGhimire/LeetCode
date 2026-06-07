class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];

        char[] ch = s.toCharArray();
        int countD = s.length();
        int countI = 0;

        for (int i = 0; i < s.length(); i++){
            if (ch[i] == 'D'){
                ans[i] = countD;
                countD --;

            } else if (ch[i] == 'I'){
                ans[i] = countI;
                countI++;
            }
        }
        ans[s.length()] = countI; //countI=countD so anything can be written here
        return ans;
    }
}