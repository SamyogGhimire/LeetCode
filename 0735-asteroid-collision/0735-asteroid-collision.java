class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int num : asteroids) {

            if (num > 0) {
                stack.push(num);

            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(num)) {

                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(num);

                } else if (stack.peek() == Math.abs(num)) {
                    stack.pop();
                }
            }
        }

        int[] ans = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            ans[i] = stack.get(i);
        }

        return ans;
    }
}