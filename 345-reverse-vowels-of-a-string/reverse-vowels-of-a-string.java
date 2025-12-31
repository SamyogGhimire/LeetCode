class Solution {
    public String reverseVowels(String s) {
        char[] character = s.toCharArray();
        int n = s.length();

        int start = 0;
        int end = n-1;

        while (start<end){
            if (!isVowel(character[start])){
                start++;
            } else if (!isVowel(character[end])){
                end--;
            } else {
                char temp = character[start];
                character[start] = character[end];
                character[end] = temp;
                start++;
                end--;
            }
      }
      return String.valueOf(character);
    }

    public static Boolean isVowel(char character){
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o'|| character == 'u' ||        character == 'A' || character == 'E' || character == 'I' || character == 'O'|| character == 'U' ){
            return true;
            
        }
        return false;
    }
}