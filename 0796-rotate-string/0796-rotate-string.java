class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()){
            return false;
        }


        for (int i=0;i<s.length(); i++){
            if (s.equals(goal)){
                return true;
            } else{
                String str = s+s;
                if (str.contains(goal)){
                    return true;
                }
            }
        }
        return false;
    }
}