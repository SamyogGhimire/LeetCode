class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] words = path.split("/");

        for (String str: words){
            if (str.isEmpty() || str.equals(".")){
                continue;
            } else if (str.equals("..")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder sb = new StringBuilder();
        for (String s: stack) {
            sb.append("/").append(s);
        }
        return sb.toString();
    }
}