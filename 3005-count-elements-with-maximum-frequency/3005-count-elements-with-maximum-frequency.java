class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int max = 0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            max = Math.max(max, entry.getValue());
        }
        int total = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (max == entry.getValue()){
                total += max;
            }
        }
        return total;
    }
}