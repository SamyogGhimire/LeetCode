class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();

        for (String t: tokens){

            if (isOperator(t)){
            
                int b = stack.pop();
                int a = stack.pop();

                if (t.equals("+")){
                    stack.push(b+a);
                }else if (t.equals("-")){
                    stack.push(a-b);
                } else if (t.equals("*")){
                    stack.push(b*a);
                } else if (t.equals("/")){
                    stack.push(a/b | 0);
                }

            } else {
                stack.push(Integer.valueOf(t));
            }
        }
            return stack.pop();
    }

    private boolean isOperator(String t){
        return t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/");
        }
}
