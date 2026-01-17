class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer, Integer> freq = new HashMap<>();

        for (int num: arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        Set <Integer> set = new HashSet<>();
        for (int value: freq.values()){
            set.add(value);
        }
        return freq.size()==set.size();
    }
}