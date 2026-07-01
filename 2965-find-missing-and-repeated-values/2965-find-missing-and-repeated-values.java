class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length * grid[0].length;
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[2];

        for (int[] row: grid){
            for (int element: row){
                if (!set.contains(element)){
                    set.add(element);
                }else {
                    ans[0] = element;
                }
            }
        }

        for (int j = 1; j < len + 1; j++){
            if (!set.contains(j)){
                ans[1] = j;
            }
        }
        return ans;
    }
}