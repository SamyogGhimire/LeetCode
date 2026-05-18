class Solution {
    public boolean isValid(String s) {
        //USING STACK
        Stack<Character> ans = new Stack<>();

        for (char ch : s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                ans.push(ch);
            } else if (ch == ')' && !ans.isEmpty() && ans.peek() == '('){
                ans.pop();
            } else if (ch == '}' && !ans.isEmpty() && ans.peek() == '{'){
                ans.pop();
            } else if (ch == ']' && !ans.isEmpty() && ans.peek() == '['){
                ans.pop();
            } else {
                return false;
            }
        }
        return ans.isEmpty();
    }
}
