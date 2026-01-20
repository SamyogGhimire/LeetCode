class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack <String> result = new Stack<>();
        int count = 1;
        int i = 0;
        while (i<target.length && count <= n){
                result.push("Push");
                if (count == target[i]){
                    i++;
                    count++;
                } else if (count != target[i]){
                    result.push("Pop");
                    count++;
                }
        }
        return result;
    }
}