class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxCount = 0;

        HashMap <Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < fruits.length; right++){
            freq.put(fruits[right], freq.getOrDefault(fruits[right],0) + 1);

            while (freq.size() > 2){
                freq.put(fruits[left], freq.get(fruits[left]) - 1);
                
                if (freq.get(fruits[left]) == 0){
                    freq.remove(fruits[left]);
                }
                left ++;
            }
           
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }
}