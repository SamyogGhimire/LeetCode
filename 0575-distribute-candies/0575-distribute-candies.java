import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {

        Set<Integer> uniqueTypes = new HashSet<>();
        for (int candy : candyType) {
            uniqueTypes.add(candy);
        }
        int maxAllowed = candyType.length / 2;

        return Math.min(uniqueTypes.size(), maxAllowed);
    }
}
