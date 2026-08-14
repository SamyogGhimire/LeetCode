class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();

        int i = 0, res = 0;

        for (int j = 0; j < s.length(); j++){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c,0)+1);

            while (map.get(c) > 2 && i < s.length()){
                char leftChar = s.charAt(i);
                map.put(leftChar, map.getOrDefault(leftChar,0)-1);
                i++;
            }
            res = Math.max(res,j-i+1);
        }
        return res;
    }
}