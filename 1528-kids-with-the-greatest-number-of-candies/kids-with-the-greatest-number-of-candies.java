class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList <>();
        int maxCandies = 0;
        for (int candy :candies){
            maxCandies = Math.max(maxCandies, candy);
        }

        for (int i=0;i<candies.length;i++){
           if (candies[i]+extraCandies < maxCandies){
            result.add(false);
           } else {
            result.add(true);
           }
        }
        return result;
    }
}