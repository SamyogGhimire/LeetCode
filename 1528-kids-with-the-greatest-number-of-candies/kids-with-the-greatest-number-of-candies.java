class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> result = new ArrayList<>();

        int maxValue = candies[0];
        for (int candy: candies){
            maxValue = Math.max(maxValue,candy);
        }
        for (int i = 0; i<candies.length; i++){
            if (candies[i] + extraCandies >= maxValue){
                result.add(true);
            } else {
                result.add (false);
            }
        }
        return result;
    }
}