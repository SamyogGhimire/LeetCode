class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        char[] wordArray = word.toCharArray();

        int idx= word.indexOf(ch);
        if (idx == -1) return word;

        for (int i=idx; i>=0; i--){
            stack.push(wordArray[i]);
        }
        for (int i=idx+1; i<wordArray.length; i++){
            stack.push(wordArray[i]);
        }
        
        StringBuilder sb =  new StringBuilder();
        for (char c: stack){
            sb.append(c);
        }
        return sb.toString();
    }
}