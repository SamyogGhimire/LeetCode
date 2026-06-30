class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int max = Collections.max(map.values());

        int value = 0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if (max > n/2 && max == entry.getValue()){
                value = entry.getKey();
            }
        }
        return value;
    }
}