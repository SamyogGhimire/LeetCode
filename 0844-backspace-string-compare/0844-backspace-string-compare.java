class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        if (s.equals(t)) return true;

        for (char ch1: s.toCharArray()){
            if (ch1 == '#' && !stack1.isEmpty()){
                stack1.pop();
            } else if (ch1 != '#'){
                stack1.push(ch1);
            }
        }
        for (char ch2: t.toCharArray()){
            if (ch2 == '#' && !stack2.isEmpty()){
                stack2.pop();
            } else if (ch2 != '#'){
                stack2.push(ch2);
            }
        }
        boolean ans = stack1.equals(stack2);
        return ans;
    }
}