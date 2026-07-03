class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() <= 1) return s;
        for (char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max = 0;
        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            max = Math.max(max, entry.getValue());
        }

        String ans = "";
        for (int i = max; i > 0; i--){
            for (Map.Entry<Character, Integer> entry: map.entrySet()){
                if (entry.getValue() == i){
                    for (int j = 0; j < i; j++){
                    ans += entry.getKey();
                    }
                }
            }
        }
        return ans;
    }
}