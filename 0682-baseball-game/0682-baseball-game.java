class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();

        for (int i=0; i<operations.length; i++){

            if (operations[i].equals("+")){
                int previous = stack.get(stack.size()-1);
                int secondPrevious = stack.get(stack.size()-2);
                int sum = previous + secondPrevious;
                stack.push(sum);

            } else if (operations[i].equals("D")){
                int num = stack.peek();
                int multi = 2 * num;
                stack.push(multi);

            } else if (operations[i].equals("C")){
                stack.pop();

            } else {
                int num = Integer.parseInt(operations[i]);
                stack.push(num);
            }
        }
        int sum = 0;

        for (int num: stack){
            sum += num;
        }

        return sum;
    }
}