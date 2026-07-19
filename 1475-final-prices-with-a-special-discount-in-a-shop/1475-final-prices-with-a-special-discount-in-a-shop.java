class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++){
            ans[i] = prices[i];
        }

        for (int i = 0 ; i < prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int idx = stack.pop();
                ans[idx] = prices[idx] - prices[i];
            }
            stack.push(i);
        }
        return ans;
    }
}