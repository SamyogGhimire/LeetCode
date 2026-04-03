import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {

        Set<Integer> uniqueCandy = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandy.add(candy);
        }
        int maxAllowed = candyType.length / 2;

        return Math.min(uniqueCandy.size(), maxAllowed);
    }
}
