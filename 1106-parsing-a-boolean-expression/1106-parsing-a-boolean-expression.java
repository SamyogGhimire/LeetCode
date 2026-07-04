import java.util.Stack;

class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {

            if (c == ',' || c == '(') {
                continue;
            }

            if (c != ')') {
                stack.push(c);
            } else {

                boolean hasTrue = false;
                boolean hasFalse = false;

                while (stack.peek() == 't' || stack.peek() == 'f') {
                    char val = stack.pop();
                    if (val == 't')
                        hasTrue = true;
                    else
                        hasFalse = true;
                }

                char op = stack.pop();
                if (op == '!') {
                    if(hasTrue){
                        stack.push('f');
                    } else{
                        stack.push('t');
                    }
                } else if (op == '&') {
                    if(hasFalse){
                        stack.push('f');
                    }else {
                        stack.push('t');
                    }
                } else { 
                    if(hasTrue){
                        stack.push('t');
                    }else{
                        stack.push('f');
                    }
                }
            }
        }

        return stack.peek() == 't';
    }
}