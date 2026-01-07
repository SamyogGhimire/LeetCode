class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        char[] chars = s.toCharArray();
        int count = 0;

        for (int i=0; i<k; i++){
            if (isVowel(chars[i])) count ++;
            ans = count;
        }
        for (int i=k; i<s.length(); i++){
                if (isVowel(chars[i])){
                    count ++;
                
                }
                if (isVowel(chars[i-k])){
                    count--;
                }
                ans = Math.max(ans,count);
            }
             return ans;
       
        }
        
        private boolean isVowel(char c){
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
    
}