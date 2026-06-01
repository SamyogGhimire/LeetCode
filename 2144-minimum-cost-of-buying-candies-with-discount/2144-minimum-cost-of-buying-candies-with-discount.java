class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int[] rev = new int[cost.length];
        int j = 0;

        for (int i = cost.length -1; i>=0; i--){
            rev[j] = cost[i];
            j++;
        }
        for (int i = 0; i < rev.length; i++){
            if ((i+1) % 3 == 0){
                continue; 
            }
            sum += rev[i];
        }
        return sum;
    }
}