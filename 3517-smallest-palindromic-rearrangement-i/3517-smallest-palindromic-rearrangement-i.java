class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if (n == 0 || n==1) return s;

        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        
        int mid = (n - 1) / 2;
        List<Character> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c: ch){
            map.put(c, map.getOrDefault(c , 0)+1);
        }

        for (int i = 0; i < n; i++){
            for(Map.Entry<Character, Integer> entry: map.entrySet()){
                if (entry.getKey() == ch[i] && entry.getValue() >= 2){
                    list.add(ch[i]);
                    entry.setValue(entry.getValue() - 2);
                }
            }
        }
        List<Character> ansList = new ArrayList<>();
        for (char c : list) {
            ansList.add(c);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ansList.add(entry.getKey());
                break;
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            ansList.add(list.get(i));
        }

        StringBuilder sb = new StringBuilder();
        for (char c : ansList) {
            sb.append(c);
        }
        return sb.toString();
    }
}