class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int n = chars.length;
        int i = 0;

        while (i < chars.length){
            char ch = chars[i];
            int count = 0;

            while (i<n && chars[i]==ch){
                count++;
                i++;
            }
            chars[index++] = ch;
            
            if (count > 1){
                for (char c: Integer.toString(count).toCharArray()){
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}