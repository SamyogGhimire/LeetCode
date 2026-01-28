class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int [2];
        int n = grid.length;
        int minVal = 0;
        HashSet <Integer> seen = new HashSet<>();

        for (int[] row: grid){
            for (int num : row){
                if (!seen.add(num)){
                    res[0]=num;
                }
                minVal = Math.min(minVal,num);
            }
        }
        for (int i = 1; i<(n*n)+1; i++){
            if (!seen.contains(i)){
                res[1] = i;
                break;
            }
        }
        return res;
    }
}