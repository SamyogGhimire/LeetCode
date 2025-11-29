class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sc = new StringBuilder();
        int count = 0;
        for (char x: s.toCharArray()){
            if (x==')'){
                count --;
            }
            if (count!=0){
                sc.append(x);

            }
            if (x == '(') count ++;
        }
    return sc.toString();
    }

}