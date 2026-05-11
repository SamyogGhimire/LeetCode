class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack();
        Stack<String> ans = new Stack();

        String res = "";
        int index = 0;
        while (index < s.length()){
            if (Character.isDigit(s.charAt(index))){
                int count = 0;
                while (Character.isDigit(s.charAt(index))){
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(count);

            } else if (s.charAt(index) == '['){
                ans.push(res);
                res = "";
                index++;

            }else if (s.charAt(index) == ']'){
                StringBuilder temp = new StringBuilder(ans.pop());
                int count = counts.pop();
                for (int i = 0; i<count; i++){
                    temp.append(res);
                }  
                res = temp.toString();
                index++;                           
                
            }else {
                res += s.charAt(index);
                index ++;
            }
        }
        return res;
    }
}