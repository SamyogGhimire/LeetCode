// import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+"); //trim remove the extra white spaces at the beginning and at last split whereas //s+ is used to remove the whitespaces and its occurences
        String last = words[words.length-1];

        int count = 0;

        for (int i=0; i<=last.length()-1; i++){
            count +=1; 
        }
        return count;
    }
}