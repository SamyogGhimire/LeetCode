class Solution {
    public List<String> buildArray(int[] target, int n) {
        List <String> result = new ArrayList<>();
        int count = 1;
        int i = 0;
        while (i<target.length && count <= n){
                result.add("Push");
                if (count == target[i]){
                    i++;
                    count++;
                } else if (count != target[i]){
                    result.add("Pop");
                    count++;
                }
        }
        return result;
    }
}