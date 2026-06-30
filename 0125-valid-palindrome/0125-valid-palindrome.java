class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.replaceAll("[^a-zA-Z0-9]",""); 
        str = str.toLowerCase();
        char[] ch = str.toCharArray();

        int left = 0;
        int right = ch.length - 1;

        while (left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        return str.equals(new String(ch));
    }
}