class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length;
        int[] ans = new int[2];

        for (int[] row: grid){
            for (int element: row){
                if (!set.contains(element)){
                    set.add(element);
                } else {
                    ans[0] = element;
                }
            }
        }

        for (int i = 1; i <= n * n; i++){
            if (!set.contains(i)){
                ans[1] = i;
            }
        }
        return ans;
    }
}